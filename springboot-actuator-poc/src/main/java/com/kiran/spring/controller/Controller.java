package com.kiran.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hi")
	public String get() {
		return "hi";
	}
}
