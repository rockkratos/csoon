package com.acs.csoon.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.acs.csoon.dao.ITestDao;
import com.acs.csoon.vo.UsrInfo;

@Repository("testDao")
public class TestDaoImpl extends SqlSessionDaoSupport implements ITestDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<UsrInfo> getAllUsr() {
		
		return getSqlSession().selectList("testMapper.getAllUsr");
		
	}
	
	@Override
	public void updateUsr(UsrInfo usr) {
		
		getSqlSession().update("testMapper.updateUsr", usr);
		
	}

	@Override
	public void insertUsr(UsrInfo usr) {
		
		getSqlSession().insert("testMapper.insertUsr", usr);
		
	}

}
