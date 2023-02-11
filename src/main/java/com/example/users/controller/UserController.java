package com.example.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/")
	public String sayHello() {
		return "Welcome guest!";
	}
	
	@GetMapping("/user")
	public String sayUser() {
		return "Welcome User!";
	}
	
	@GetMapping("/admin")
	public String sayAdmin() {
		return "Welcome Admin!";
	}
	
}
