  package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.LoginDAO;
import com.VO.ComplaintVO;
import com.VO.LoginVO;

@Controller
public class MainController 
{
	@Autowired
	LoginDAO ldao;
	
	@RequestMapping(value = { "/", "index.html"}, method = RequestMethod.GET)
	public ModelAndView index() {
		System.out.println("user index");
		return new ModelAndView("user/index");
	}
	
	@RequestMapping(value ="login.html", method = RequestMethod.GET)
	public ModelAndView index1() {
		System.out.println("user login");
		return new ModelAndView("user/login");
	}
	
	@RequestMapping(value ="admin.html", method = RequestMethod.GET)
	public ModelAndView index12(HttpSession session,@ModelAttribute LoginVO loginVO) {
		System.out.println("admin");
		
	    
		return new ModelAndView("admin/index");
	}
	
	@RequestMapping(value ="staff.html", method = RequestMethod.GET)
	public ModelAndView staff(HttpSession session,@ModelAttribute LoginVO loginVO) {
		System.out.println("staff");
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String name = auth.getName(); 
	    
		return new ModelAndView("staff/index");
	}
		
	@RequestMapping(value = "user.html", method = RequestMethod.GET)
	public ModelAndView user(HttpSession session,Model model,@ModelAttribute LoginVO lvo) 
	{
		System.out.println("user");
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String name = auth.getName(); 
	      session.setAttribute("username", name);
	     
		return new ModelAndView("user/userIndex");
	}
	@RequestMapping(value = "/403page.html", method = RequestMethod.GET)
	public String AccessDenied(HttpSession session,Model model) 
	{
		System.out.println("403");
		return "user/login";
	}
	@RequestMapping(value = "/logout.html", method = RequestMethod.GET)
	public ModelAndView logout1(HttpSession session,Model model) 
	{
		return new ModelAndView("user/index");
	}
	@RequestMapping(value="/j_spring_security_logout" , method=RequestMethod.GET)
	public String logout(Model model)
	{
		System.out.println("*****Successfully Loggedout******");
		return("user/index");
	}
/*	@RequestMapping(value="index.html" , method=RequestMethod.GET)
	public ModelAndView home()
	{
		return new ModelAndView("user/userIndex");
	}*/
	
	@RequestMapping(value="loadTeam.html",method=RequestMethod.GET)
	public ModelAndView loadAddComplient()
	{
		return new  ModelAndView("user/team");
		
	}
	
	@RequestMapping(value="loadUserTeam.html",method=RequestMethod.GET)
	public ModelAndView loadUserTeam(){
		return new ModelAndView("user/userTeam");
	}
	
}