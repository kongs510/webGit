package com.bit.sts01.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller
public class Ex01Controller {
	
	
	@RequestMapping("/ex01.bit")
	public ModelAndView ex01(){
		return new ModelAndView("ex01");
	}

}
