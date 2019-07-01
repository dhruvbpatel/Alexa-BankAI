package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.LoginDAO;
import com.DAO.UserProfileDAO;
import com.VO.LoginVO;
import com.VO.UserProfileVO;
import com.util.BaseMethods;

@Controller
public class UserProfileController {
	
	@Autowired
	LoginDAO loginDAO;
	
	@Autowired
	UserProfileDAO userProfileDAO;
	
	
	@RequestMapping(value="viewProfile.html",method=RequestMethod.GET)
	public ModelAndView viewProfile()
	{
		String name = BaseMethods.getUser(); 
		
		List ls	=loginDAO.searchByName(name);
		LoginVO loginVO = (LoginVO)ls.get(0);
		
		
		List ls1 = this.userProfileDAO.findByLoginId(loginVO);
		
		
		return new ModelAndView("user/updateProfile","updateProfile",(UserProfileVO)ls1.get(0));	

	}
	
	@RequestMapping(value="updateProfile.html",method=RequestMethod.POST)
	public ModelAndView updateProfile(@ModelAttribute UserProfileVO userProfileVO)
	{
		this.userProfileDAO.insert(userProfileVO);
		return new ModelAndView("redirect:/viewProfile.html");
	}

}
