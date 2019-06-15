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
		
		List loanTypeList =loanTypeDAO.search();
		
		return new ModelAndView("admin/addLoanRate","loanTypeList",loanTypeList).addObject("loanRateVO",new LoanRateVO());
		
	}
	
	@RequestMapping(value="insertLoanRate",method=RequestMethod.POST)
	public ModelAndView insertLoanRate(@ModelAttribute LoanRateVO loanRateVO)
	{
		this.loanRateDAO.insert(loanRateVO);
		return new ModelAndView("redirect:/loadLoanRate");
		
	}
	
	
	@RequestMapping(value="viewLoanRate",method=RequestMethod.GET)
	public ModelAndView viewLoanType(@ModelAttribute LoanRateVO loanRateVO){
		
		List ls = loanRateDAO.search();
		return new ModelAndView("admin/viewLoanRate","loanRateList",ls);
	}

	@RequestMapping(value="deleteLoanRate",method=RequestMethod.GET)
	public ModelAndView deleteLoanType(@RequestParam int id,@ModelAttribute LoanRateVO loanRateVO){
		
		loanRateVO.setId(id);
		loanRateDAO.delete(loanRateVO);
			
	return new ModelAndView("redirect:/viewLoanRate");	
	}
	
	
	@RequestMapping(value="editLoanRate",method=RequestMethod.GET)
	public ModelAndView editLoanRate(@RequestParam int id,@ModelAttribute LoanRateVO loanRateVO){
		loanRateVO.setId(id);
		
		List loanRateList  = loanRateDAO.edit(loanRateVO);
		
		List loanTypeList = loanTypeDAO.search();
		LoanRateVO loanRateVO2 = (LoanRateVO)loanRateList.get(0);
		
		System.out.println(loanRateVO2.getLoanRate());
		System.out.println(loanRateVO2.getLoanRateDescription());
		System.out.println(loanRateVO2.getCid().getLoanType());
		
		return new ModelAndView("admin/addLoanRate","loanRateVO",(LoanRateVO)loanRateList.get(0)).addObject("loanTypeList",loanTypeList);
	}
	
	
	
}
