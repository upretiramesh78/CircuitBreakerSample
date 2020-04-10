package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CircuitBreakerServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerServicesApplication.class, args);
	}
	
	
  @RequestMapping(value="/recommended")
  public String readingList() {
	  return "Hello Ramesh Chandra Upreti";
  }
 

}
