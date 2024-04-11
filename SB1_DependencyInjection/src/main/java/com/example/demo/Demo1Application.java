package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.constructor.Price;
import com.example.demo.constructor.Product;
import com.example.demo.interface_Inj.product1;
import com.example.demo.interface_Inj1.Principal;
import com.example.demo.setter.Men;
import com.example.demo.setter.Women;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo1Application.class, args);

		//setter injection
		Men m = context.getBean(Men.class);
		m.setMoney(10000);

		Women w = context.getBean(Women.class);
		w.getYourMoney();

		//constructor injection
		Price p = context.getBean(Price.class);
		p.setTotalPrize(1234);

		Product pr = context.getBean(Product.class);
		pr.totalPrice();
		
		//interface injection
		product1 pro = context.getBean(product1.class);
		pro.your_discount();
		
		
		Principal pri = context.getBean(Principal.class);
		pri.getDetail();
		
		
	}

}
