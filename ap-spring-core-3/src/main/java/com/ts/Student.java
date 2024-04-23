package com.ts;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	Teacher t;
	
	@Autowired
	Employee emp;
	
	public void stdMethod() {
		System.out.println("Hello Student");
		t.m1();
		emp.msg();
	}
}
