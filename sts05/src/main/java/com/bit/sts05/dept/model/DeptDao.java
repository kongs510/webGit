package com.bit.sts05.dept.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bit.sts05.dept.model.entity.DeptVo;

public interface DeptDao {

	List<DeptVo> selectAll();

}