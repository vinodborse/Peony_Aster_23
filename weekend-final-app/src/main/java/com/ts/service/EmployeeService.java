package com.ts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Employee;
import com.ts.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository er;

	public String addEmployee(Employee employee) {
		
		if(employee.getAge() < 18) {
			return "You are a minor";
		} else if(employee.getDept().equals("HR") || 
				  employee.getDept().equals("ADMIN") ||
				  employee.getDept().equals("IT")) {
			
			if(employee.getDept().equals("HR")) {
				employee.setSalary(10000);
			} else if(employee.getDept().equals("ADMIN")) {
				employee.setSalary(50000);
			} else {
				employee.setSalary(20000);
			}
			
			er.save(employee);
			
			return "Your application has been registered successfully";
		} else {
			return "Please select correct Dept.";
		}

	}

	public Employee getEmployee(Long empId) {
		return er.findById(empId).get();
	}
}
