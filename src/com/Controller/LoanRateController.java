package com.Controller;

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
	
	@RequestMapping(value="loadLoanRate",method=RequestMethod.GET)
	public ModelAndView loadLoanRate()
	{
		
		List ls =loanTypeDAO.search();
		
		return new ModelAndView("admin/addLoanRate","loanTypeList",ls).addObject("loanRateVO",new LoanRateVO());
		
	}
	
	@RequestMapping(value="insertLoanRate",method=RequestMethod.POST)
	public ModelAndView insertLoanRate(@ModelAttribute LoanRateVO loanRateVO)
	{
		this.loanRateDAO.insert(loanRateVO);
		return new ModelAndView("redirect:/loadLoanRate");
		
		
	}
	
//	
//	@RequestMapping(value="viewLoanType",method=RequestMethod.GET)
//	public ModelAndView viewLoanType(@ModelAttribute LoanTypeVO loanTypeVO){
//		
//		List ls = loanTypeDAO.search(loanTypeVO);
//		return new ModelAndView("admin/viewLoanType","loanTypeList",ls);
//	}
//
//	@RequestMapping(value="deleteLoanType",method=RequestMethod.GET)
//	public ModelAndView deleteLoanType(@RequestParam int id,@ModelAttribute LoanTypeVO loanTypeVO){
//		
//		loanTypeVO.setId(id);
//		loanTypeDAO.delete(loanTypeVO);
//		
//		
//	return new ModelAndView("redirect:/viewLoanType");	
//	}
//	
//	
//	@RequestMapping(value="editLoanType",method=RequestMethod.GET)
//	public ModelAndView editLoanType(@RequestParam int id,@ModelAttribute LoanTypeVO loanTypeVO){
//		loanTypeVO.setId(id);
//		List ls  = loanTypeDAO.edit(loanTypeVO);
//		return new ModelAndView("admin/addLoanType","LoanTypeVO",ls.get(0));
//	}
//	
	
	
}
