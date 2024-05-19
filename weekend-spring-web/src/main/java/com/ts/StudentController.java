package com.ts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //  @Controller + @ResponseBody
public class StudentController {
	
	@PutMapping("/s-name")
	public String studentName() {
		System.out.println("Vinod");
		return "Student name is Vinod";
	}
	
	@GetMapping("/get-student")
	public Student getStudent() {
		Student std = new Student(1, "Vinod", "Pune");	
		return std;
	}
}
