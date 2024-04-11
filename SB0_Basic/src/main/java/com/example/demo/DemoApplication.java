package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.demo.Demo;
import com.example.demo.examp2.Example2;

@ComponentScan({ "com.demo", "com.example.demo" })
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// ApplicationContext is an IOC container, that will manage object creation and
		// object manage
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		// Example1 is class which is not deviated from base package
		Example1 e1 = context.getBean(Example1.class);
		e1.greet();
		// Example2 is class which is not deviated from base package
		Example2 e2 = context.getBean(Example2.class);
		e2.greet2();

		// Demo is class which is deviated from base package, so we need to write
		// @componentScan annotation
		Demo d = context.getBean(Demo.class);
		System.out.println(d.hashCode());
		d.greet();

		// by default the scope is singletone, which is manage by IOC container
		// here d1 and d2 both object gives the same hashcode means the
		// object created by IOC are by default single tone
		Demo d1 = context.getBean(Demo.class);
		System.out.println("The hashcode of object d1: " + d1.hashCode());

		Demo d2 = context.getBean(Demo.class);
		System.out.println("The hashcode of object d2: " + d2.hashCode());

		// if we want diff object everytime we need to write scope on top of the class
		// which is managing by IOC
		// the scope "prototype" will give different objects
		Example1 ex1 = context.getBean(Example1.class);
		System.out.println("The hashcode of object ex1: " + ex1.hashCode());

		Example1 ex2 = context.getBean(Example1.class);
		System.out.println("The hashcode of object ex2: " + ex2.hashCode());
	}

}
