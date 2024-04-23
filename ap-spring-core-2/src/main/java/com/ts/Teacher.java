package com.ts;

public class Teacher {

	private int id;
	private String name;
	
	private Student std;	
	
	public void m1() {

		std.stdMethod();
	}
	
	
	public Student getStd() {
		return std;
	}


	public void setStd(Student std) {
		this.std = std;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Teacher() {}

	public Teacher(int id, String name, Student std) {
		this.id = id;
		this.name = name;
		this.std = std;
	}

	
	
	

}
