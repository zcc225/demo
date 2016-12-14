package com.zccpro.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.dao.UserMapper;
import com.test.model.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class test {
	
	@Autowired
	private UserMapper userMapper;
	@Test
	public void test() {
		User user = userMapper.selectByPrimaryKey(10);
		
		System.out.println();
	}

}
