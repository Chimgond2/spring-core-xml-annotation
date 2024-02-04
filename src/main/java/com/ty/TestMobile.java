package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMobile {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		Mobile mobile=(Mobile)applicationContext.getBean("mobile");
		mobile.mobileDetails();
		
	}

}
