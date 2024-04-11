package com.example.demo.interface_Inj;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class ElectronicDiscount implements Discount {

	@Override
	public int getDiscount() {
	  return 100;
		
	}

}
