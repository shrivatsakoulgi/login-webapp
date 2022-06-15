package com.axisbank.sampleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("username") String userName, 
			@RequestParam("password") String password) {

		ModelAndView mv = new ModelAndView();		
		mv.setViewName("response.jsp");
		if(userName.equals("admin") && password.equals("root")) {
			mv.addObject("status", true);
		}
		else {
			mv.addObject("status", false);
		}
		return mv;
	}
}
