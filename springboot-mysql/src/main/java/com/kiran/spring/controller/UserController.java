package com.kiran.spring.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiran.spring.model.User;
import com.kiran.spring.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepo;

	@GetMapping("/user")
	public Collection<User>  getUsers() {
		return (Collection<User>) userRepo.findAll();
	}
	
}
