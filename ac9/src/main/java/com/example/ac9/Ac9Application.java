package com.example.ac9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.ac9.myServices.Coach;

@SpringBootApplication(scanBasePackages = {"com.example.ac9.myServices"})
public class Ac9Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Ac9Application.class, args);

		// get the bean from spring container
		Coach theCoach = context.getBean(Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
