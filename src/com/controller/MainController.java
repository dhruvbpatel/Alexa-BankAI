  package com.controller;

import java.util.List;

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

import com.DAO.AddLoanDAO;
import com.DAO.ComplaintDAO;
import com.DAO.FeedbackDAO;
import com.DAO.LoginDAO;
import com.VO.ComplaintVO;
import com.VO.LoginVO;
import com.util.BaseMethods;

@Controller
public class MainController 
{
	@Autowired
	LoginDAO ldao;
	@Autowired
	ComplaintDAO complaintDAO;
	@Autowired
	FeedbackDAO feedBackDAO;
	@Autowired
	AddLoanDAO addLoanDAO;
	
	
	
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
		List complainList = this.complaintDAO.complainCount();
		
		List feedBackCountList = this.feedBackDAO.feedBackCount();
		
		List approvedLoanCount = this.addLoanDAO.approvedLoanCount();
		
		List pendingLoanCount = this .complaintDAO.pendingLoanCount();
		
		List graph  = this.addLoanDAO.graph();
		System.out.println(graph.size());
		return new ModelAndView("admin/index")
				.addObject("complainList",complainList.get(0))
				.addObject("feedBackList", feedBackCountList.get(0))
				.addObject("approvedLoanCount", approvedLoanCount.get(0))
				.addObject("pendingLoanCount",pendingLoanCount.get(0))
				.addObject("graphList",graph);
	}
	
	@RequestMapping(value ="staff.html", method = RequestMethod.GET)
	public ModelAndView staff(HttpSession session,@ModelAttribute LoginVO loginVO) {
		System.out.println("staff");
		String name = BaseMethods.getUser(); 
		List ls	=ldao.searchByName(name);
		
		loginVO = (LoginVO)ls.get(0);
		List complainList = this.complaintDAO.complainCount();
		
		List feedBackCountList = this.feedBackDAO.feedBackCount();
				
		List pendingLoanCount = this .complaintDAO.pendingLoanCount();
		
		List approvedLoanCount = this.addLoanDAO.approvedLoanCount();
		
		List graph  = this.addLoanDAO.graph();
		
		return new ModelAndView("staff/index")
				.addObject("complainList",complainList.get(0))
				.addObject("feedBackList", feedBackCountList.get(0))
				.addObject("pendingLoanCount",pendingLoanCount.get(0))
				.addObject("approvedLoanCount", approvedLoanCount.get(0))
				.addObject("graphList",graph);
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