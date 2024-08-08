package com.sat.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsBasicFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBasicFirstApplication.class, args);
	}

}
