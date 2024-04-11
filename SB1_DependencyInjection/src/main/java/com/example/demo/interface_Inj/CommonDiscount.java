package com.example.demo.interface_Inj;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("common")
@Component
public class CommonDiscount implements Discount{

	
	@Override
	public int getDiscount() {
		return 10;
		
	}

}
