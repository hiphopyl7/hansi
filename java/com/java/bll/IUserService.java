package com.java.bll;

import java.util.List;

import com.java.entity.User;

public interface IUserService {
	public User getUserById(String userId);  
	public List selall(String any);
}
