package com.demo;

import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	public void greet() {
		System.out.println("Greet from demo-- which is deviated from base package"
				+ "so it give no such bean error, so we need to write @componentScan on top of main method class");
	}

}
