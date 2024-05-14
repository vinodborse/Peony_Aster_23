package com.ts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Student;
import com.ts.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sr;
	
	public Student addStudent(Student std) {
		return sr.save(std);	
	}
	
	public List<Student> getStudents() {
		return sr.findAll();
	}
	
	public List<Student> getStudentWithName(String name) {

		List<Student> finalStudents = new ArrayList<>();
		
		List<Student> students = sr.findByName(name);
		
		for(Student std : students) {
			if(std.getAddress().equals("Mumbai")) {
				finalStudents.add(std);
			}
		}
		
		return finalStudents;
	}
	
}








