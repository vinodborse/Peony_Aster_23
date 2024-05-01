package com.ts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;

@RestController
public class StudentController {

	@GetMapping("/std-name/{fn}/{ln}")
	public String studentName(@PathVariable("fn") String firstname, @PathVariable("ln") String lastname) {
		return "fn = " + firstname + " ln = " + lastname;
	}
	
	@GetMapping("/sname")	
	public String studentFullName(@RequestParam("fn") String fname, @RequestParam("ln") String lname) {
		return "Student fname is= " + fname + " lname = "+ lname;
	}
	
	@GetMapping("/sdata")
	public String studentData(@RequestBody Student s) {
		return "Student name = " + s.getName();
	}
	
}


/*

@PathVariable -->(GET) localhost:8080/app/std-name/Vinod
@RequestParam -->(GET) localhost:8080/app/sname?sn=Vinod Borse
@RequestBody

https://www.google.co.in/search?q=cricket

*/