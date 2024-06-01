package com.ts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ts.model.Student;
import com.ts.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sr;
	
	public Student addStudent(Student std) {
		return sr.save(std);
	}
	
	public Student getStudent(Long rollno) {
		return sr.findById(rollno).get();
	}
}
