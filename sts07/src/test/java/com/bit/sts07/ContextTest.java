package com.bit.sts07;

import static org.junit.Assert.assertNull;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class ContextTest {
		@Inject
		SqlSessionFactory sqlSessionFactory;
	
		@Test
		public void testBean() {
			assertNull(sqlSessionFactory);
		}
}
