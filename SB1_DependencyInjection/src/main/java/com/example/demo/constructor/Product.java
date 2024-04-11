package com.example.demo.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {
	
	Price p;

	@Autowired
	public Product(Price p) {
		super();
		this.p = p;
	}
	
	public void totalPrice() {
		System.out.println("The total price is: "+ p.getTotalPrize());
	}
	
	

}
