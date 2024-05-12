package com.ts;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	@Autowired
	private Department dept;
	
	public void empMethod() {
		System.out.println("We are in employee class");
		dept.deptMsg();
	}
}
