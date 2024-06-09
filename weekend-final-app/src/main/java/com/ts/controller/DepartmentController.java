package com.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Department;
import com.ts.service.DepartmentService;

@RestController 
@RequestMapping("/api/department")
public class DepartmentController {

	@Autowired
	DepartmentService ds;
	
	@PostMapping("/add")
	public ResponseEntity<Department> addDepartment(@RequestBody Department dept) {
		Department result= ds.addDepartment(dept);
		return ResponseEntity.ok(result);
	}
	
}
