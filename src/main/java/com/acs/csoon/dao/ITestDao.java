package com.acs.csoon.dao;

import java.util.List;

import com.acs.csoon.vo.UsrInfo;

public interface ITestDao {
	
	public List<UsrInfo> getAllUsr();
	public void updateUsr(UsrInfo usr);
	public void insertUsr(UsrInfo usr);

}
