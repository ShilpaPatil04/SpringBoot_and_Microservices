package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//controller class
@Controller
public class MomController {

	//request URL
	@RequestMapping("/mom")
	public String momController() {
		System.out.println("Welcome to my mom's cafe");
		//logical name
		return "coffee";
	}
}
