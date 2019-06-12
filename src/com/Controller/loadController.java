package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loadController {

	@RequestMapping(value="/")
	public ModelAndView index(){
		return new ModelAndView("admin/index");
	}
}
