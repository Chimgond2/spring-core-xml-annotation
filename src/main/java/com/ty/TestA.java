package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		
		Cow  cow=(Cow)applicationContext.getBean("cow");
		cow.eat();
	}

}
