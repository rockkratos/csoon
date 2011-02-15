package com.acs.csoon.mgr.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acs.csoon.dao.ITestDao;
import com.acs.csoon.mgr.ITestMgr;
import com.acs.csoon.vo.UsrInfo;

@Service("testMgr")
public class TestMgrImpl implements ITestMgr {

	@Autowired
	private ITestDao testDao;
	
	@Override
	public void updateUsr(UsrInfo usr) {
		
		testDao.updateUsr(usr);
		
		UsrInfo usr2 = new UsrInfo();
		usr2.setUsrId("1");
		usr2.setUsrPwd("1AAABBB");
		
		testDao.updateUsr(usr2);
		
	}

	@Override
	public void addUsr(UsrInfo usr) {
		
		testDao.insertUsr(usr);
		
	}

}
