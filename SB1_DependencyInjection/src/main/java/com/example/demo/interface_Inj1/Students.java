package com.example.demo.interface_Inj1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Students implements School{

	
	@Override
	public void whatYouAre() {
		System.out.println("I'm a student");
	}
 
}
