package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//controller class
@Controller
public class greetController {
    
	//url
	@RequestMapping("/greet")
	public String greetCont() {
		System.out.println("Hellooo Thereeee!!!!!!1");
		
		//logical name
		return "hello";
	}
}
