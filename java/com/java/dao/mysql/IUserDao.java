package com.java.dao.mysql;

import java.util.List;
import java.util.Map;

import com.java.entity.User;



public interface IUserDao {
	public User findById(String id);
	public List selall(String suiyi);
	
}
