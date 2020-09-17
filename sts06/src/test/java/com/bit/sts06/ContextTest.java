package com.bit.sts06;

import static org.junit.Assert.assertNotNull;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration("classpath:/applicationContext.xml")
public class ContextTest {
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testGetBean() {
		assertNotNull(sqlSessionFactory.openSession());
	}

}
