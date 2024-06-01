package com.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;
import com.ts.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping("/add-student")
	public Student addStudent(@RequestBody Student std) {
		return ss.addStudent(std);
	}
	
	@GetMapping("/get-student")
	public Student getStudent(@RequestParam("rollno") Long rollno) {
		return ss.getStudent(rollno);
	}
	
}
