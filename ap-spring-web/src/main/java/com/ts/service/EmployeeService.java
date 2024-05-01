package com.ts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ts.model.Employee;

@Service
public class EmployeeService {
	
	public Employee empDetails(int id) {
		
		Employee e1 = new Employee(1, "Vinod", "IT", 1000, "Pune");
		Employee e2 = new Employee(2, "Don", "IT", 1900, "Faltu gali");
		Employee e3 = new Employee(6, "Anarkali", "GOV", 120, "Pune");
		Employee e4 = new Employee(7, "Manish", "IT", 1200, "Pune");
		Employee e5 = new Employee(10, "Salmon", "Movie", 16, "Mumbai");
		

		List<Employee> emps = new ArrayList<>();
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		Employee tempEmp = new Employee();

		for(Employee emp: emps) {
			if(emp.getId() == id) {
				tempEmp = emp;
				break;
			}
		}
		
		return tempEmp;
	}
}
