package com.bit.sts01.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Ex05Controller {

	@RequestMapping("/ex06")
	public String ex01(int su) {
		System.out.println(su);
		return "ex06";
	}
}
