package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDog {
	public static void main(String[] args) {
		ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		Dog dog=(Dog)applicationContext.getBean("mychoice");
		dog.dance();
	}

}
