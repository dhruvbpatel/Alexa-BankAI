package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.LoanStaffDAO;
import com.DAO.LoginDAO;
import com.VO.LoanStaffVO;
import com.VO.LoginVO;
import com.util.BaseMethods;



@Controller
public class LoanStaffController {

	
	@Autowired
	LoanStaffDAO loanStaffDAO;
	
	@Autowired
	LoginDAO loginDAO;
	
	@RequestMapping(value="loadLoanStaff.html",method=RequestMethod.GET)
	public ModelAndView loadLoanStaff()
	{
		return new ModelAndView("admin/addLoanStaff","LoanStaffVO",new LoanStaffVO());
	}

	@RequestMapping(value="insertLoanStaff.html",method=RequestMethod.POST)
	public ModelAndView insertLoanStaff(@ModelAttribute LoanStaffVO loanStaffVO,LoginVO loginVO)
	{
		String password = BaseMethods.generatePassword();
		loginVO = loanStaffVO.getLoginVO();
		loginVO.setPassword(password);
		loginVO.setRole("ROLE_STAFF");
		loginVO.setEnabled("1");
		
		
		
		BaseMethods.sendMail(loginVO.getEmail(), password,loanStaffVO.getFirstName());
		
		this.loginDAO.insert(loginVO);
		
		loanStaffVO.setLoginVO(loginVO);
		
		this.loanStaffDAO.insert(loanStaffVO);
		
		return new ModelAndView("redirect:/loadLoanStaff.html");
	}
	
	
	@RequestMapping(value="viewLoanStaff.html",method=RequestMethod.GET)
	public ModelAndView viewLoanStaff()
	{
		List ls=loanStaffDAO.search();
		return new ModelAndView("admin/viewLoanStaff","loanStaff",ls);	

	}
	
	
	@RequestMapping(value="deleteLoanStaff.html",method=RequestMethod.GET)
	public ModelAndView deleteLoanStaff(@RequestParam int id,@RequestParam int loginId,@ModelAttribute LoanStaffVO loanStaffVO,@ModelAttribute LoginVO loginVO )
	{
		loanStaffVO.setId(id);
		this.loanStaffDAO.delete(loanStaffVO);
		loginVO.setId(loginId);
		loginDAO.delete(loginVO);
		return new ModelAndView("redirect:/viewLoanStaff.html");
		
	}
	
	
	
}
