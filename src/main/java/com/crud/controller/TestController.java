package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private StudentService studentService;
	
	
	
	@RequestMapping(value="/welcome")
	public String welcome(){
		return "welcome to Spring";
	}
}
