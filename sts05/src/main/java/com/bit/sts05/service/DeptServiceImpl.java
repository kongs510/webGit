package com.bit.sts05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.bit.sts05.dept.model.DeptDao;

public class DeptServiceImpl implements DeptSerive {

	
	@Autowired
	DeptDao deptDao;
	
	@Override
	public void list(Model model) {
		model.addAttribute("list",deptDao.selectAll());
	}
}
