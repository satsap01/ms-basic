package com.sat.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsBasicSecondController {
	@GetMapping("/second")
	public String getSecondString() {
		System.out.println("I am in second");
		return "HelloWorld From Second Microservice";
	}
}
