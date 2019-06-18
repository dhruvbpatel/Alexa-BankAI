package com.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.ComplaintDAO;
import com.VO.ComplaintVO;
import com.VO.LoanTypeVO;
import com.VO.LoginVO;

@Controller
public class ComplaintController {
	
	@Autowired
	ComplaintDAO complaintDAO;
	

	@RequestMapping(value="loadAddComplaint.html",method=RequestMethod.GET)
	public ModelAndView loadAddComplient()
	{
		return new  ModelAndView("admin/addComplaint","ComplaintVO",new ComplaintVO());
		
		
	}
	
	@RequestMapping(value="insertComplaint.html",method=RequestMethod.POST)
	public ModelAndView insertMethod(@ModelAttribute ComplaintVO complaintVO,LoginVO loginVO)
	{
		
		Date d=new Date();

		DateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		complaintVO.setStatus("PENDING");
		complaintVO.setLoginVO(loginVO);
		complaintVO.setComplaintDate(format.format(d));
		
		this.complaintDAO.insert(complaintVO);
		
		return new ModelAndView("redirect:/loadAddComplaint.html");
		
	}
	
	
	@RequestMapping(value="viewComplaint.html",method=RequestMethod.GET)
	public ModelAndView viewComplaint()
	{
		List ls=complaintDAO.search();
		return new ModelAndView("admin/viewComplaint","complaint",ls);	

	}
	
	
	@RequestMapping(value="deleteComplaint.html",method=RequestMethod.GET)
	public ModelAndView deleteComplaint(@RequestParam int id,@ModelAttribute ComplaintVO complaintVO )
	{
		complaintVO.setId(id);
		complaintDAO.delete(complaintVO);
		return new ModelAndView("redirect:/viewComplaint.html");
		
	}
	
}
