package com.Controller;

import java.util.List;

import javax.persistence.Id;

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
	
	
	@RequestMapping(value="viewLoanType",method=RequestMethod.GET)
	public ModelAndView viewLoanType(@ModelAttribute LoanTypeVO loanTypeVO){
		
		List ls = loanTypeDAO.search();
		return new ModelAndView("admin/viewLoanType","loanTypeList",ls);
	}

	@RequestMapping(value="deleteLoanType",method=RequestMethod.GET)
	public ModelAndView deleteLoanType(@RequestParam int id,@ModelAttribute LoanTypeVO loanTypeVO){
		
		loanTypeVO.setId(id);
		loanTypeDAO.delete(loanTypeVO);
		
		
	return new ModelAndView("redirect:/viewLoanType");	
	}
	
	
	@RequestMapping(value="editLoanType",method=RequestMethod.GET)
	public ModelAndView editLoanType(@RequestParam int id,@ModelAttribute LoanTypeVO loanTypeVO){
		loanTypeVO.setId(id);
		List ls  = loanTypeDAO.edit(loanTypeVO);
		return new ModelAndView("admin/addLoanType","LoanTypeVO",ls.get(0));
	}
}
