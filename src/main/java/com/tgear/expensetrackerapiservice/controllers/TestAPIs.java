package com.tgear.expensetrackerapiservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Getter;

@RestController
@RequestMapping("/test")
public class TestAPIs {

	@GetMapping("/home")
	public String home() {
		return "<h2>Welcome</h2>";
	}

	@GetMapping("/user")
	public Test user() {
		return new Test(2, "For User");
	}
	
	@GetMapping("/admin")
	public Test admin() {
		return new Test(3, "For Admin");
	}
	
}

@AllArgsConstructor
@Getter
class Test {
	private long id;
	private String message;
}
