package com.java.dao.oralce;

import java.util.List;
import java.util.Map;

import com.java.entity.User;



public interface IUserForOracleDao {
	public User findById(String id);
	public List selall(String suiyi);
	
}
