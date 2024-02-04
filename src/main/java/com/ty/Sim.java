package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sim {
	@Value(value = "airtel")
	String name;
	
	
	public void simdetails() {
		System.out.println("sim is "+name);
	}

}
