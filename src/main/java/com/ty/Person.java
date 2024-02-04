package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private int id;
	private String name;
	private Double price;

	@Value(value = "89")
	public void setId(int id) {
		this.id = id;
	}

	@Value(value = "tejas")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "5200")
	public void setPrice(Double price) {
		this.price = price;
	}

	public void details() {
		System.out.println("id is " + id);
		System.out.println("name is " + name);
		System.out.println("price is " + price);

	}

}
