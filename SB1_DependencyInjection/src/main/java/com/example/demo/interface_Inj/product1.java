package com.example.demo.interface_Inj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class product1 {

	//@Qualifier("common")
	@Autowired
	private Discount discount;
	
	public void your_discount() {
		System.out.println("product: "+discount.getDiscount());
	}
	
	

}
