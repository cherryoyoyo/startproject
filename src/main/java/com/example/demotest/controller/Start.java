package com.example.demotest.controller;

import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aa")
public class Start {

	
	
	@GetMapping("/start")
	public  String start (){
	return"i am start";
	}
}
