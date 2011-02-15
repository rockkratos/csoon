package com.acs.csoon.mgr;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acs.csoon.vo.UsrInfo;

public class FirstTest {
	
	private ApplicationContext ac;

	@Before
	public void setUp() throws Exception {
		ac = new ClassPathXmlApplicationContext(new String[] { "spring/**/*.xml" });
	}
	
	@Test
	public void testMgr() {
		
//		ITestDao testDao = (ITestDao) ac.getBean("testDao");
//		System.out.println(testDao.getAllUsr().size());
		
		ITestMgr testMgr = (ITestMgr) ac.getBean("testMgr");
		
		UsrInfo usr = new UsrInfo();
		usr.setUsrId("1");
		usr.setUsrPwd("111111");
		
		testMgr.updateUsr(usr);
		
	}

}
