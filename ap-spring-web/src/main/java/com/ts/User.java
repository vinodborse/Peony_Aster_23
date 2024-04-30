package com.ts;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

	@GetMapping("/user") // localhost:8080/app/user (GET)
	 public String test() {
		 return "Hello user";
	 }
	
	@PutMapping("/name") //localhost:8080/app/name (GET)
	public String nameDispaly() {
		return "Name is VINOD";
	}

	@PostMapping("/data")
	public String data() {
		return "Data from POST method..!!!";
	}
	
	@DeleteMapping("/dlt")
	public String deleteUser() {
		return "We are in DELETE method..!!!!!";
	}
	
	
}

/*
@Controller
@ResponseBody

@RestController

C create    ---> @PostMapping
R read      ---> @GetMapping
U update    ---> @PutMapping
D delete    ---> @DeleteMapping



*/


