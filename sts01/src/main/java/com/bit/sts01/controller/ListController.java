package com.bit.sts01.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.sts01.model.DeptDao;

@Controller
public class ListController {
DeptDao deptDao;

	@Autowired
	public void setDeptdao(DeptDao deptdao) {
	this.deptDao = deptdao;
}


	@RequestMapping("/list")
	public String list(Model model) throws SQLException {
		System.out.println(deptDao);
		model.addAttribute("list",deptDao.selectAll());
		return "list";
	
	}
}
