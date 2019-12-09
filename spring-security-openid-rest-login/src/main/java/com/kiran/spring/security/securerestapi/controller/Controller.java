package com.kiran.spring.security.securerestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/user/{name}")
	public String getMethod(@PathVariable String name) {
		return "Hi "+name;
	}
	
}
