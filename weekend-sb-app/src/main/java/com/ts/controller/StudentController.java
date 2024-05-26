package com.ts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;

@RestController
public class StudentController {
	
	@GetMapping("/hello")
	public Student hello() {
		return new Student(1, "Vinod", "Pune");
	}
}
