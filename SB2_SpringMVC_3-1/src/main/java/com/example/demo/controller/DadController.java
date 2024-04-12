package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DadController {

	@RequestMapping("/dad")
	public String dadController() {
		System.out.println("Welocme all");
		return "greet";
	}
}
