package com.java.bll.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java.bll.IUserService;
import com.java.bll.IUserService2;
import com.java.dao.oralce.IUserForOracleDao;
import com.java.entity.User;

@Service("UserServiceForOracleImpl")  
public class UserServiceForOracleImpl implements IUserService2 {
	 @Resource  
	    private IUserForOracleDao userDao;  
	
	public User getUserById(String userId) {
		return this.userDao.findById(userId);
	}
	public List selall(String any){
		return userDao.selall(any);
	}

}
