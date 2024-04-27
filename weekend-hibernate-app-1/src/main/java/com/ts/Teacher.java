package com.ts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {

	@Id
	private int id;
	private String name;
	private String dept;
	private String sub;
	
	
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	public Teacher() {}
	
	public Teacher(int id, String name, String dept, String sub) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sub = sub;
	}
	
	
	
}
