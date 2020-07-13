package com.example.eurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

}

/*
http://localhost:8081/greeting
http://localhost:8081/persons/info/1
http://localhost:8081/persons/1
http://localhost:8081/persons
*/
