package com.example.eurekaFeignClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class EurekaFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignClientApplication.class, args);
	}

}

/*
http://localhost:8080/get/greeting
http://localhost:8080/get/persons/info/1
http://localhost:8080/get/persons/1
http://localhost:8080/get/persons/
*/
