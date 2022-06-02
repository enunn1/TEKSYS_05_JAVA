package com.example.ac9.myServices;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Database connection";
	}

}
