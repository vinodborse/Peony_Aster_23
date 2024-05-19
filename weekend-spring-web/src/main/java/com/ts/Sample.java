package com.ts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

	@GetMapping("/test")
	public String testMethod() {
		System.out.println("We are using spring web");
		return "We are using spring web";
	}
	
	@PostMapping("/tm")
	public String testMethod2() {
		System.out.println("We are calling new method");
		return "We are calling new method";
	}
	
	
	
}

/*
@GetMapping   --- 
@PostMapping
@PutMapping
@DeleteMapping


*/