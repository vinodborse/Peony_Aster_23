package com.ts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //--> @Controller + @ResponseBody
public class Employee {
	
	@GetMapping("/emp")
	public String employeeDetails() {
		System.out.println("We are in employee's employeeDetail method");
		return "We are in employee's employeeDetail method";
	}
}
