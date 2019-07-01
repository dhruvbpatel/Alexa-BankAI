package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.AddLoanDAO;
import com.DAO.LoanRateDAO;
import com.DAO.LoanTypeDAO;
import com.DAO.LoginDAO;
import com.VO.AddLoanVO;
import com.VO.LoanRateVO;
import com.VO.LoanStaffVO;
import com.VO.LoginVO;
import com.util.BaseMethods;


@Controller
public class AddLoanController {
	
	@Autowired
	LoanTypeDAO loanTypeDAO;
	
	@Autowired
	LoanRateDAO loanRateDAO;
	
	@Autowired
	AddLoanDAO addLoanDAO;
	
	@Autowired
	LoginDAO loginDAO;
	
	@RequestMapping(value="loadAddLoan.html",method=RequestMethod.GET)
	public ModelAndView loadAddComplient(@ModelAttribute LoanRateVO loanRateVO)
	{
		
		List loanTypeList =this.loanTypeDAO.search();
		List loanRateList=this.loanRateDAO.search(loanRateVO);
		return new  ModelAndView("user/applyForLoan1","applyLoan",new AddLoanVO()).addObject("loanTypeList",loanTypeList)
				.addObject("loanRateList", loanRateList);

		
	}
	
	@RequestMapping(value="insertAddLoan.html",method=RequestMethod.POST)
	public ModelAndView insertAddLoan(@ModelAttribute AddLoanVO addLoanVO,LoginVO loginVO,
			@RequestParam("file") MultipartFile file,
			@RequestParam("panCard") MultipartFile panCard,
			@RequestParam("photofile") MultipartFile photofile,
			HttpSession session)
	{
		String name = BaseMethods.getUser(); 
		List ls	=loginDAO.searchByName(name);
		
		loginVO = (LoginVO)ls.get(0);
		addLoanVO.setLoginVO(loginVO);
		addLoanVO.setStatus("UNDER REVIEWED");
		
		
		String filePath = session.getServletContext().getRealPath("/")+ "documents//"+loginVO.getId();
		
		
		addLoanVO.setPanCardName(panCard.getOriginalFilename());
		addLoanVO.setPanCardPath(filePath);
		BaseMethods.fileUpload(panCard.getOriginalFilename(), filePath, panCard);

		addLoanVO.setPhotoName(photofile.getOriginalFilename());
		addLoanVO.setPhotoPath(filePath);
		BaseMethods.fileUpload(photofile.getOriginalFilename(), filePath, photofile);
		
		addLoanVO.setResidentialProofName(file.getOriginalFilename());
		addLoanVO.setResidentialProofPath(filePath);
		BaseMethods.fileUpload(file.getOriginalFilename(), filePath, file);		
		
		addLoanDAO.insert(addLoanVO);
		
		return new ModelAndView("redirect:/loadAddLoan.html");
	
	}
	
	
	@RequestMapping(value="staffLoanRequest.html",method=RequestMethod.GET)
	public ModelAndView viewLoanRequest()
	{
		List ls=addLoanDAO.search();
		return new ModelAndView("staff/viewLoanRequest","loanRequest",ls);	

	}
	

	@RequestMapping(value="verifyDocuments.html",method=RequestMethod.GET)
	public ModelAndView verifyLoanRequest(@RequestParam int id,@ModelAttribute AddLoanVO addLoanVO)
	{
		addLoanVO.setId(id);
		List ls=addLoanDAO.verifySearch(addLoanVO);
		return new ModelAndView("staff/verifyLoanRequest","verifyLoanRequest",ls);	

	}
	
	@RequestMapping(value="approvedDocuments.html",method=RequestMethod.GET)
	public ModelAndView approvedDocuments(@RequestParam int id,@ModelAttribute AddLoanVO addLoanVO,LoginVO loginVO,LoanStaffVO loanStaffVO)
	{
		addLoanVO.setId(id);
		List ls = addLoanDAO.verifySearch(addLoanVO);
		
		AddLoanVO addLoanVO2 = (AddLoanVO)ls.get(0);
		addLoanVO2.setStatus("APPROVED");
		
		this.addLoanDAO.insert(addLoanVO2);
		
		String data = "YOUR LOAN IS APPROOVED BY OUR STAFF , PLEASE VISIT TO OUR NEAREST BRANCH FOR FURTHER FORMALITIES.";
		
		BaseMethods.sendUpdateMail(addLoanVO2.getLoginVO().getEmail(), data);
		
		this.addLoanDAO.insert(addLoanVO2);
	
		
		return new ModelAndView("redirect:/staffLoanRequest.html");	
		
	}
	
	@RequestMapping(value="rejectDocuments.html",method=RequestMethod.GET)
	public ModelAndView rejectDocuments(@RequestParam int id,@ModelAttribute AddLoanVO addLoanVO)
	{
		addLoanVO.setId(id);
		List ls = addLoanDAO.verifySearch(addLoanVO);
		
		AddLoanVO addLoanVO2 = (AddLoanVO)ls.get(0);
		addLoanVO2.setStatus("REJECT");
		
		this.addLoanDAO.insert(addLoanVO2);
		
		String data = "YOUR LOAN IS REJECTED BY OUR STAFF .";
		
		BaseMethods.sendUpdateMail(addLoanVO2.getLoginVO().getEmail(), data);
		
		return new ModelAndView("redirect:/staffLoanRequest.html");	

	}	
	

	@RequestMapping(value="adminViewLoanRequest.html",method=RequestMethod.GET)
	public ModelAndView adminViewLoanRequest()
	{
		List ls=addLoanDAO.search();
		return new ModelAndView("admin/viewLoanRequest","loanRequest",ls);	

	}
	
	
	@RequestMapping(value="viewLoan.html",method=RequestMethod.GET)
	public ModelAndView viewLoan(@ModelAttribute LoanRateVO loanRateVO)
	{
		List ls=loanRateDAO.search(loanRateVO);
		return new ModelAndView("user/viewLoanRequest","loanRequest",ls);	
	}
	
	@RequestMapping(value="viewLoan1.html",method=RequestMethod.GET)
	public ModelAndView viewLoan1(@ModelAttribute LoanRateVO loanRateVO)
	{
		List ls=loanRateDAO.search(loanRateVO);
		return new ModelAndView("user/viewLoanRequest2","loanRequest",ls);	
	}
	
	
	@RequestMapping(value="viewYourLoan.html",method=RequestMethod.GET)
	public ModelAndView viewYourLoan(@ModelAttribute LoanRateVO loanRateVO)
	{
		String name = BaseMethods.getUser(); 
		List ls	=loginDAO.searchByName(name);
		
		LoginVO loginVO = (LoginVO)ls.get(0);
		
		List ls1=addLoanDAO.searchOwnLoan(loginVO);
		return new ModelAndView("user/viewLoanRequest2","viewLoan",ls1);	
	}
	
	
}
