package com.example.demo.interface_Inj1;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements School{

	@Override
	public void whatYouAre() {
		System.out.println("I'm a teacher");
	}

	
  
} 
