package com.java.bll.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java.bll.IUserService;
import com.java.dao.mysql.IUserDao;
import com.java.entity.User;

@Service("userService")  
public class UserServiceImpl implements IUserService {
	 @Resource  
	    private IUserDao userDao;  
	
	public User getUserById(String userId) {
		return this.userDao.findById(userId);
	}
	public List selall(String any){
		return userDao.selall(any);
	}

}
