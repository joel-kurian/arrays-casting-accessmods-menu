package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController
public class Controller {
	@GetMapping("/hello")
	public String helloWorld() {
		return "Spring boot";
	}
	
	@GetMapping("/employee")
	public Employee giveEmployee() {
		return new Employee(1, "John");
	}
}
