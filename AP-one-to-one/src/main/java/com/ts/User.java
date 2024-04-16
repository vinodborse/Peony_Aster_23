package com.ts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {

	@Id
	private int id;
	
	private String name;
	
	@OneToOne
	private Pan pan;
	
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
	
	
	
	public Pan getPan() {
		return pan;
	}
	public void setPan(Pan pan) {
		this.pan = pan;
	}
	public User() {}
	
	public User(int id, String name, Pan pan) {
		this.id = id;
		this.name = name;
		this.pan = pan;
	}
	
	
	
}
