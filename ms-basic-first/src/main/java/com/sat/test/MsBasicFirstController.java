package com.sat.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsBasicFirstController {

	@Autowired
	private MsBasicFirstProxy proxy1;
	
	@GetMapping("/first")
	public String getHelloWorld() {
		System.out.println("I am in first");
		return "HelloWorld From First Microservice";
	}
	
	@GetMapping("/firstcall")
	public String callSecond() {
		System.out.println("I am in First Call");
		return "HelloWorld From First Microservice" +  " - " + proxy1.getSecondMS();
	}
	
}
