package com.ts;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	Teacher t;
	
	
	public void stdDataMethod() {
		System.out.println("We are in student method");
	//	t.tchDataMethod();
	}
}
