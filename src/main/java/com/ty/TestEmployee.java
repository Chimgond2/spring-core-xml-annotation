package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		Employee employee = (Employee) applicationContext.getBean("employee");
		employee.details();
	}

}
