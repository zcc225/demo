package com.test.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.model.User;
import com.test.service.TestService;

public class test {

	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		TestService service = (TestService) context.getBean("service");
		User user = service.selectById(10);
	}

}
