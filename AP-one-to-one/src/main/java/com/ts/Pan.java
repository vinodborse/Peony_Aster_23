package com.ts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pan {
	
	@Id
	private int id;
	
	private String number;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public Pan() {}
	
	public Pan(int id, String number) {
		this.id = id;
		this.number = number;
	}
	
	
}
