package com.ts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Department;
import com.ts.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository dr;

	public Department addDepartment(Department dept) {
		return dr.save(dept);
	}
}
