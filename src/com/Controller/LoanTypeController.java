package com.controller;

import java.util.List;

import org.hibernate.property.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.LoanTypeDAO;
import com.VO.LoanTypeVO;


@Controller
public class LoanTypeController {
	
	@Autowired
	LoanTypeDAO loanTypeDAO;
	
	@RequestMapping(value="loadLoanType.html",method=RequestMethod.GET)
	public ModelAndView loadLoanType()
	{
		return new ModelAndView("admin/addLoanType","LoanTypeVO",new LoanTypeVO());
	}
	
	@RequestMapping(value="insertLoanType.html",method=RequestMethod.POST)
	public ModelAndView insertLoanType(@ModelAttribute LoanTypeVO loanTypeVO)
	{
		this.loanTypeDAO.insert(loanTypeVO);
		return new ModelAndView("redirect:/viewLoanType.html");
	}
	
	@RequestMapping(value="viewLoanType.html",method=RequestMethod.GET)
	public ModelAndView viewLoanType()
	{
		List ls=loanTypeDAO.search();
		return new ModelAndView("admin/viewLoanType","loantype",ls);	

	}
	@RequestMapping(value="deleteLoan.html",method=RequestMethod.GET)
	public ModelAndView deleteLoan(@RequestParam int id,@ModelAttribute LoanTypeVO loanTypeVO )
	{
		loanTypeVO.setId(id);
		loanTypeDAO.delete(loanTypeVO);
		return new ModelAndView("redirect:/viewLoanType.html");
		
	}
	
	@RequestMapping(value="editLoan",method=RequestMethod.GET)
	public ModelAndView editLoan(@RequestParam int id,@ModelAttribute LoanTypeVO loanTypeVO)
	{
		loanTypeVO.setId(id);
		List ls=loanTypeDAO.edit(loanTypeVO);
		return new ModelAndView("admin/addLoanType","LoanTypeVO",ls.get(0));
		
	}
}
