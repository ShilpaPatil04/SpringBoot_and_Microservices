package com.example.demo.interface_Inj1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Principal {
      
	//@Qualifier("stud")
	@Autowired
	private School s;
	
	
	public void getDetail() {
		s.whatYouAre();
	}
}
