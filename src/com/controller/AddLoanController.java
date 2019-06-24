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
			@RequestParam MultipartFile file,MultipartFile panCard,MultipartFile photofile,
			HttpSession session)
	{
		String name = BaseMethods.getUser(); 
		List ls	=loginDAO.searchByName(name);
		
		loginVO = (LoginVO)ls.get(0);
		
		String filePath = session.getServletContext().getRealPath("/")+ "documents"+loginVO.getId();
		
		
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
	

}
