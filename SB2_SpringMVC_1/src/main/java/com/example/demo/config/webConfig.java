package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//configuration class
//setting the suffix and prefix using InternalResourceViewResolver
@Configuration
public class webConfig {

	public InternalResourceViewResolver resource() {
		InternalResourceViewResolver ir = new InternalResourceViewResolver();
		ir.setPrefix("/");
		ir.setSuffix("hello");
		return ir;
	}
}
