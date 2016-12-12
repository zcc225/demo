package com.test.dao;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.service.TestService;

public class test {
	public void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		TestService service = (TestService) context.getBean("service");
		service.selectById(10);
	}
}
