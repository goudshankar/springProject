package com.shs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView("page");
		//add model object
		mv.addObject("greetings","welcome to onlineshopping");
		return mv;
	}
}
