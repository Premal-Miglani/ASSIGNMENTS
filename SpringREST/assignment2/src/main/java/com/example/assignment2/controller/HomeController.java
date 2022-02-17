package com.example.assignment2.controller;

import com.example.assignment2.entities.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/login")
	public String userAuth(@ModelAttribute("userModel1") User userModel1) {
		
		boolean isValid = check(userModel1.getUsername(),userModel1.getPassword());
		
		if(isValid) {
			return "Valid User";
		}
		else {
			return "Invalid User";
		}
	}

	private boolean check(String username, String password) {
		if(username.contentEquals("Premal") && password.contentEquals("1234")) {
			return true;
		}
		else {
		return false;
	}
		
	}

}