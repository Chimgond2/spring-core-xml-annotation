package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	Enginee enginee;
@Autowired
	public void setEnginee(Enginee enginee) {
		this.enginee = enginee;
	}
	public void bikeDetails() {
		enginee.engineedetails();
		System.out.println("bike is on");
	}

}
