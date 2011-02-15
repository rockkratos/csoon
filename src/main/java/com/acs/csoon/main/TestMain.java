package com.acs.csoon.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acs.csoon.mgr.ITestMgr;
import com.acs.csoon.utils.UUIDUtil;
import com.acs.csoon.vo.UsrInfo;

public class TestMain {
	
	private static ApplicationContext ac;
	
	public static void main(String[] args) {
		
		TestMain tm = new TestMain();
		tm.init();
		
		ITestMgr testMgr = (ITestMgr) ac.getBean("testMgr");
		UsrInfo usr = new UsrInfo();
		usr.setUsrId(UUIDUtil.generateUUID());
		usr.setUsrName("testusr");
		usr.setUsrPwd("bbbbb");
		
		testMgr.addUsr(usr);

	}
	
	private void init() {
		
		ac = new ClassPathXmlApplicationContext(new String[] { "spring/**/*.xml" });
		
	}

}
