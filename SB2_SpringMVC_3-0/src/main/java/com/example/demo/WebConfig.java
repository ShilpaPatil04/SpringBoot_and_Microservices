package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfig {
	
	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver ir = new InternalResourceViewResolver();
		ir.setPrefix("/WEB-INF/");
		ir.setSuffix(".jsp");
		return ir;
	}

}
