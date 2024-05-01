package com.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Employee;
import com.ts.service.EmployeeService;

@RestController //--> @Controller + @ResponseBody
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/emp-details")
	public Employee empDetails(@RequestParam("id") int id) {
		return empService.empDetails(id);
	}

}
