package com.test.service;

import com.test.dao.UserMapper;
import com.test.model.User;

public class TestService {

	UserMapper userMapper;
	
	public User selectById(int s){
		return userMapper.selectByPrimaryKey(s);
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	
}
