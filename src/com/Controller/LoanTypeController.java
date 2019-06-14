package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.LoanTypeDAO;
import com.VO.LoanTypeVO;

@Controller
public class LoanTypeController {
	
	@Autowired
	LoanTypeDAO loanTypeDAO;
	
	@RequestMapping(value="loadLoanType",method=RequestMethod.GET)
	public ModelAndView loadLoanType()
	{
		return new ModelAndView("admin/addLoanType","LoanTypeVO",new LoanTypeVO());
	}
	
	@RequestMapping(value="insertLoanType",method=RequestMethod.POST)
	public ModelAndView insertLoanType(@ModelAttribute LoanTypeVO loanTypeVO)
	{
		this.loanTypeDAO.insert(loanTypeVO);
		return new ModelAndView("redirect:/loadLoanType");
	}
	
	

}
