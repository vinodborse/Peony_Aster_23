package com.ts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;
import com.ts.service.StudentService;

@RestController
public class SampleController {

	@Autowired
	StudentService ss;
	
	@GetMapping("/test")
	public String test() {
		return "We are good";
	}
	
	@PostMapping("/add-student")
	public Student addStudent(@RequestBody Student std) {
		return ss.addStudent(std);

	}
	
	@GetMapping("/all-students")
	public List<Student> allStudents() {
		return ss.getStudents();
	}
	// http://localhost:8080/get-student?name=Salmon
	@GetMapping("/get-student")
	public List<Student> getStudentWithName(@RequestParam("name") String name) {
		return ss.getStudentWithName(name);
		
	}
}
