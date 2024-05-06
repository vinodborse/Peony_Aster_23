package com.ts.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Student;
import com.ts.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sr;
	
	public Student getStudentDetails(Long rollno) {
		
		Optional<Student> s = sr.findById(rollno);
				
		return s.get();	
	}
}
