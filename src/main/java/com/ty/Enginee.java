package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Enginee {
	@Value(value = "50")
	int cc;
	void engineedetails() {
		System.out.println("cc is"+cc);
	}


	
	

}
