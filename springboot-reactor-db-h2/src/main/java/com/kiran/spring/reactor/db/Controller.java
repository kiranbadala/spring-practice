package com.kiran.spring.reactor.db;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class Controller {
	@Autowired
	UserRepo repo;
	
	@GetMapping("/user")
	public Flux<Integer> getUser() {
		System.out.println("Request came. flux integers");
		return Flux.range(5, 20);
	}
}
