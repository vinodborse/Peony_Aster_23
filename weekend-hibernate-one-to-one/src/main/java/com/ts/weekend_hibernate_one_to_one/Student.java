package com.ts.weekend_hibernate_one_to_one;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private int rollno;
	private String name;
	
	@OneToOne
	private Marks marks;
	
	
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
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
	public Student() {}
	public Student(int rollno, String name, Marks marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	
	
	
	
}
