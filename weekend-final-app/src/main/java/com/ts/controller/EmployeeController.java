package com.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@PostMapping("/add/{nm}")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee, 
											  @PathVariable("nm") String name) {

		String result = es.addEmployee(employee);
		
		return ResponseEntity.ok(result);
		
	}

	@GetMapping("/get")
	public ResponseEntity<Employee> getEmployee(@RequestParam("empId") Long empId) {
		Employee emp = es.getEmployee(empId);
		return ResponseEntity.ok(emp);
	}
	
	@GetMapping("/get-by-name")
	public ResponseEntity<Employee> getEmployeeByName(@RequestParam("name") String name) {
		Employee emp = es.getEmployeeByName(name);
		return ResponseEntity.ok(emp);
	}
	
}
