package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Example1 {

	public void greet() {
		System.out.println("Greet from example1");
	}
}
