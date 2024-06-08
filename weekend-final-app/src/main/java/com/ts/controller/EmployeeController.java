package com.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Employee;
import com.ts.service.EmployeeService;


@RestController // -> @Controller + @ResponseBody
@RequestMapping("/api/employee")
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	EmployeeService es;

	@PostMapping("/add")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {

		String result = es.addEmployee(employee);
		
		return ResponseEntity.ok(result);
		
	}

	@GetMapping("/get")
	public ResponseEntity<Employee> getEmployee(@RequestParam("empId") Long empId) {
		Employee emp = es.getEmployee(empId);
		return ResponseEntity.ok(emp);
	}
	
}
