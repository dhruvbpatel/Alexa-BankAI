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
import com.DAO.LoanRateDAO;
import com.DAO.LoanTypeDAO;
import com.VO.ComplaintVO;
import com.VO.LoanRateVO;
import com.VO.LoanTypeVO;
import com.VO.LoginVO;

@Controller
public class ComplaintController {
	
	@Autowired
	ComplaintDAO complaintDAO;
	
	@Autowired
	LoanTypeDAO loanTypeDAO;
	
	@Autowired
	LoanRateDAO loanRateDAO;

	@RequestMapping(value="loadAddComplaint.html",method=RequestMethod.GET)
	public ModelAndView loadAddComplient()
	{
		return new  ModelAndView("admin/addComplaint","ComplaintVO",new ComplaintVO());
		
	}
	
	@RequestMapping(value="insertComplaint.html",method=RequestMethod.POST)
	public ModelAndView insertMethod(@ModelAttribute ComplaintVO complaintVO,LoginVO loginVO)
	{
		loginVO.setId(11);
		
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
	
	@RequestMapping(value="replyComplaint.html",method=RequestMethod.GET)
	public ModelAndView replyComplaint(@RequestParam int id,@ModelAttribute ComplaintVO complaintVO)
	{
		complaintVO.setId(id);
		List ls=complaintDAO.edit(complaintVO);
		return new ModelAndView("admin/ReplyComplaint","ComplaintVO",ls.get(0));
		
	}
	
	@RequestMapping(value="resolvedComplaint.html",method=RequestMethod.POST)
	public ModelAndView resolvedComplaint(@RequestParam int id,@ModelAttribute ComplaintVO complaintVO)
	{
		Date d=new Date();

		DateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		complaintVO.setStatus("Resolved");
		
		complaintVO.setReplyDate(format.format(d));
		
		System.out.println(complaintVO.getStatus());
		
		this.complaintDAO.insert(complaintVO);
		
		return new ModelAndView("redirect:/viewComplaint.html");
	}
	
	@RequestMapping(value="viewStaffComplaint.html",method=RequestMethod.GET)
	public ModelAndView viewStaffComplaint(@ModelAttribute ComplaintVO complaintVO)
	{
		List ls=complaintDAO.searchUserComplaint();
		return new ModelAndView("staff/viewStaffComplaint","complaint",ls);	
	}
	
	
	@RequestMapping(value="viewOwnComplaint.html",method=RequestMethod.GET)
	public ModelAndView viewOwnComplaint(@ModelAttribute ComplaintVO complaintVO)
	{
		List ls=complaintDAO.searchUserComplaint();
		return new ModelAndView("staff/viewOwnComplaint","complaint",ls);	
	}
	
	

	@RequestMapping(value="loadStaffAddComplaint.html",method=RequestMethod.GET)
	public ModelAndView loadStaffAddComplaint()
	{
		return new  ModelAndView("staff/addComplaint","ComplaintVO",new ComplaintVO());
		
		
	}
	
	
	
	
	@RequestMapping(value="insertStaffComplaint.html",method=RequestMethod.POST)
	public ModelAndView insertStaffComplaint(@ModelAttribute ComplaintVO complaintVO,LoginVO loginVO)
	{
		
		Date d=new Date();

		DateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		complaintVO.setStatus("PENDING");
		loginVO.setId(11);
		complaintVO.setLoginVO(loginVO);
		complaintVO.setComplaintDate(format.format(d));
		
		this.complaintDAO.insert(complaintVO);
		
		return new ModelAndView("staff/addComplaint","ComplaintVO",new ComplaintVO());
	}
	
	
	
	@RequestMapping(value="replyStaffComplaint.html",method=RequestMethod.GET)
	public ModelAndView replyStaffComplaint(@RequestParam int id,@ModelAttribute ComplaintVO complaintVO)
	{
		complaintVO.setId(id);
		List ls=complaintDAO.edit(complaintVO);
		return new ModelAndView("staff/replyStaffComplaint","ComplaintVO",ls.get(0));
		
	}

	
	@RequestMapping(value="resolvedStaffComplaint.html",method=RequestMethod.POST)
	public ModelAndView resolvedStaffComplaint(@RequestParam int id,@ModelAttribute ComplaintVO complaintVO)
	{
		Date d=new Date();

		DateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		complaintVO.setStatus("Resolved");
		
		complaintVO.setReplyDate(format.format(d));
		
		System.out.println(complaintVO.getStatus());
		
		this.complaintDAO.insert(complaintVO);
		
		return new ModelAndView("redirect:/viewStaffComplaint.html");
	}
	

	
}
