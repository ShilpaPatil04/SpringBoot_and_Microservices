package com.example.demo.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Women {
     Men m ;

	public Men getM() {
		return m;
	}

	@Autowired
	public void setM(Men m) {
		this.m = m;
	}
	
	public void getYourMoney() {
		System.out.println("Get your money: "+ m.getMoney());
	}
     
     

}
