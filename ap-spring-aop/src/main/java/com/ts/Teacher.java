package com.ts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	public void tchDataMethod() {
		System.out.println("We are in Teacher method");	
	}
}
