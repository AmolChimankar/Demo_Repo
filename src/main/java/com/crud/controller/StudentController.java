package com.crud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@PostMapping
	public String post()
	{
		return "Student added Successfullu";
	}
	
	@DeleteMapping
	public String delete()
	{
		return "Student deleted";
	}

}
