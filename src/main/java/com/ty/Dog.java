package com.ty;

import org.springframework.stereotype.Component;

@Component(value = "mychoice")
public class Dog {
	public void dance() {
		System.out.println("dog is dancing");
	}

}
