package com.spring.xml.assignment1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assignment1Controller {

	@GetMapping("/BankName")
	public String getBankName() {
		
		return "State Bank Of India";
	}
	
	@GetMapping("/BankAddress")
	public String getBankAddress(){
		
		return "Niladri Road, Electronic City - Phase 1 - Banaglore PIN CODE- XXXXXX";
		
	}
	
}
