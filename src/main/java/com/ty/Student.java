package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;
	private double percentage;

	public Student(@Value(value = "9" )int id,@Value(value = "chandu") String name,@Value(value = "85.25") double percentage) {

		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public void details() {
		System.out.println("id id " + id);
		System.out.println("id name " + name);
		System.out.println("id percentage " + percentage);

	}

}
