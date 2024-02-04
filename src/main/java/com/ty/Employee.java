package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value(value = "10")
	private int id;
	@Value(value = "jack")
	private String name;
	@Value(value = "5654.02")
	private double salary;
	
	public void details() {
		System.out.println("is is "+id);
		System.out.println("is is "+name);
		System.out.println("is is "+salary);

	}

}
