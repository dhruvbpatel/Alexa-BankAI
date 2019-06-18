package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.LoanRateDAO;
import com.DAO.LoanTypeDAO;
import com.VO.LoanRateVO;
import com.VO.LoanTypeVO;


@Controller
public class LoanRateController {

	
	@Autowired
	LoanRateDAO loanRateDAO;
	
	@Autowired
	LoanTypeDAO loanTypeDAO;
	
	@RequestMapping(value="loadLoanRate.html",method=RequestMethod.GET)
	public ModelAndView loadLoanRate()
	{
		
		List loanTypeList =this.loanTypeDAO.search();
		
		return new ModelAndView("admin/addLoanRate","LoanRateVO",new LoanRateVO()).addObject("loanTypeList",loanTypeList);
		
	}
	
	@RequestMapping(value="insertLoanRate.html",method=RequestMethod.POST)
	public ModelAndView insertLoanRate(@ModelAttribute LoanRateVO loanRateVO)
	{
		
		this.loanRateDAO.insert(loanRateVO);
		return new ModelAndView("redirect:/viewLoanRate.html");

				
	}
	

	@RequestMapping(value="viewLoanRate.html",method=RequestMethod.GET)
	public ModelAndView viewLoanRate(@ModelAttribute LoanRateVO loanRateVO){		
	List loanRateList = loanRateDAO.search(loanRateVO);
	return new ModelAndView("admin/viewLoanRate","loanRateList",loanRateList);
}
	
	@RequestMapping(value="deleteLoanRate.html",method=RequestMethod.GET)
	public ModelAndView deleteLoanType(@RequestParam int id,@ModelAttribute LoanRateVO loanRateVO){
		
		loanRateVO.setId(id);
		loanRateDAO.delete(loanRateVO);
		
		
	return new ModelAndView("redirect:/viewLoanRate.html");	
	}

	@RequestMapping(value="editLoanRate.html",method=RequestMethod.GET)
	public ModelAndView editLoanRate(@RequestParam int id,@ModelAttribute LoanRateVO loanRateVO){
		loanRateVO.setId(id);
		List loanRateList  = loanRateDAO.edit(loanRateVO);
		List loanTypeList =loanTypeDAO.search();
		return new ModelAndView("admin/addLoanRate","LoanRateVO",(LoanRateVO)loanRateList.get(0)).addObject("loanTypeList",loanTypeList);
	}
	
	
	
	@RequestMapping(value="viewStaffLoanRate.html",method=RequestMethod.GET)
	public ModelAndView viewStaffLoanRate(@ModelAttribute LoanRateVO loanRateVO){		
		List StaffLoanRateList = loanRateDAO.search(loanRateVO);
		return new ModelAndView("staff/viewStaffLoanRate","staffLoanRateList",StaffLoanRateList);
	}
	
}
