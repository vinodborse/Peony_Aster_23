package com.ts;

public class Employee {
	
	private Department dept;

	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public Employee() {}
	
	public Employee(Department dept) {
		this.dept = dept;
	}
	
	public void emp() {
		System.out.println("We are in Employee class");
		dept.msg();
	}
}
