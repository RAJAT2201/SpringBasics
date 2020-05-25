package com.pluralsight.confereneapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.confereneapp.model.User;

@RestController
public class UserController {

	@GetMapping("/user")
	public User getUser(@RequestParam(value="firstName", defaultValue="Rajat") String firstName,
								@RequestParam(value="lastName", defaultValue="Rastogi") String lastName,
								@RequestParam(value="age", defaultValue= "25") int age) {
		
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAge(age);
		
		return user;
	}
	
	@PostMapping("/user")
	public User postUser(User user) {
		System.out.println("User firstName" + user.getFirstName());
		return user;
	}
}
