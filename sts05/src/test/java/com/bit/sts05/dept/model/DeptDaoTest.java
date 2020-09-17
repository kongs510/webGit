package com.bit.sts05.dept.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class DeptDaoTest {

	@Test
	public void testSelectAll() {
	DeptDao deptDao=new DeptDaoImpl();
	deptDao.selectAll();
	}

}
