package com.ts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Teacher;

@RestController
public class TeacherController {

	@GetMapping("/tch")
	public Teacher teacherMethod() {
		return new Teacher(101, "VInod", "IT", 1000);
	}
}
