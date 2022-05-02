package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.controller.*;


@SpringBootApplication
public class MavenDemoProjectApplication {

	public static void main(String[] args) {
		
		//SpringApplication.run(CreateUserTable.class, args);
		SpringApplication.run(CreateUser.class, args);
		
	}
}
