package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.FeedbackDAO;
import com.DAO.LoginDAO;
import com.VO.FeedbackVO;
import com.VO.LoginVO;
import com.util.BaseMethods;

@Controller
public class FeedbackController {

	@Autowired
	FeedbackDAO feedbackDAO; 
	
	@Autowired
	LoginDAO loginDAO;

	
/*	@RequestMapping(value="viewFeedback.html",method=RequestMethod.GET)
	public ModelAndView viewFeedback()
	{
		List ls=feedbackDAO.search();
		return new ModelAndView("staff/viewFeedback","feedback",ls);	

	}*/
	
	@RequestMapping(value="insertFeedback.html",method=RequestMethod.GET)
	public ModelAndView insertFeedback(@ModelAttribute FeedbackVO feedbackVO,LoginVO loginVO)
	{
		
		String name = BaseMethods.getUser(); 
		List ls	=loginDAO.searchByName(name);
		
		loginVO = (LoginVO)ls.get(0);
		feedbackVO.setLoginVO(loginVO);
		feedbackDAO.insert(feedbackVO);
		return new ModelAndView("redirect:/loadAddFeedback.html");
		
	}
	
	@RequestMapping(value="loadAddFeedback.html",method=RequestMethod.GET)
	public ModelAndView loadAddFeedback()
	{
		
		return new ModelAndView("user/addFeedback","feedbackVO",new FeedbackVO());	
	}
	
	@RequestMapping(value="viewFeedback.html",method=RequestMethod.GET)
	public ModelAndView viewFeedback()
	{
		List ls=feedbackDAO.search();
		
		return new ModelAndView("user/viewFeedback","feedback",ls);	

	
	}
	@RequestMapping(value="viewAdminFeedback.html",method=RequestMethod.GET)
	public ModelAndView viewAdminFeedback()
	{
		List ls=feedbackDAO.search();
		
		return new ModelAndView("admin/viewFeedback","feedback",ls);	

	
	}
	
	@RequestMapping(value="viewStaffFeedback.html",method=RequestMethod.GET)
	public ModelAndView viewStaffFeedback()
	{
		List ls=feedbackDAO.search();
		
		return new ModelAndView("staff/viewFeedback","feedback",ls);	

	
	}
}

