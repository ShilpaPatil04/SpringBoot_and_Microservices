package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MomController {
	
	@RequestMapping("/mom")
	public String momController() {
		System.out.println("This is mom controller");
		return "greet";
	}
	

}
