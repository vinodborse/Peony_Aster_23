package com.ts.weekend_hibernate_one_to_one;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Marks {
	@Id
	private int id;
	private int math;
	private int english;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public Marks() {}
	
	public Marks(int id, int math, int english) {
		this.id = id;
		this.math = math;
		this.english = english;
	} 
	
	
	
}
