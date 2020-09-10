package com.bit.sts01.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Ex04Controller {

	@RequestMapping( value="/ex04",params= {"id"},method=RequestMethod.GET)
	public String ex04(HttpServletRequest req) {
		System.out.println(req.getParameter("id"));
		return "ex04";
	}
}
