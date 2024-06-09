package com.ts.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Department;
import com.ts.model.Employee;
import com.ts.repository.DepartmentRepository;
import com.ts.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository er;
	
	@Autowired
	DepartmentRepository dr;

	public String addEmployee(Employee employee) {
		
		List<Department> depts =  dr.findAll();
		
		
		boolean isDeptAvailable = false;
		
		for(Department dept: depts) {
			if(dept.getName().equals(employee.getDept())) {
				isDeptAvailable = true;
				List<Employee> emps = dept.getEmployee();
				emps.add(employee);
				dept.setEmployee(emps);
			}
		}
		
		if(employee.getAge() < 18) {
			return "You are a minor";
		} else if(isDeptAvailable) {
			
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
	
	public Employee getEmployeeByName(String name) {
		return er.findEmp(name).get();
	}
}
