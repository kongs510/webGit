package com.bit.sts07.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.sts07.model.entity.DeptVo;
import com.bit.sts07.model.entity.EmpVo;

public interface EmpDao {

	
	List<DeptVo> selectAll() throws SQLException;
}
