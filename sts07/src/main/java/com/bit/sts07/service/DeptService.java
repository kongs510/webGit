package com.bit.sts07.service;

import java.sql.SQLException;

import org.springframework.ui.Model;

public interface DeptService {

	void listService(Model model) throws SQLException;

}