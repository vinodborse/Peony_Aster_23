package com.ts.model;

public class Student {

	private int rollno;
	private String name;
	private String addres;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	
	public Student() {}
	
	public Student(int rollno, String name, String addres) {
		this.rollno = rollno;
		this.name = name;
		this.addres = addres;
	}
	
	
	
}
