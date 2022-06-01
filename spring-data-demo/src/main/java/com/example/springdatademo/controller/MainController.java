package com.example.springdatademo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springdatademo.entity.EmployeeEntity;
import com.example.springdatademo.repository.EmployeeRepository;

@Controller
@RequestMapping(path = "/demo") // adds a path to the URL's start /example
public class MainController {

	@Autowired
	private EmployeeRepository employeeRepo;

	Logger logger = LoggerFactory.getLogger(MainController.class);

	@PostMapping(path = "/add") // This map is for post only
	public @ResponseBody String addNewEmployee(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String jobTitle,
			@RequestParam Integer salary) {
		EmployeeEntity newEmployee = new EmployeeEntity();
		newEmployee.setFirstName(firstName);
		newEmployee.setLastName(lastName);
		newEmployee.setJobTitle(jobTitle);
		newEmployee.setSalary(salary);

		employeeRepo.save(newEmployee);
		return "Saved new employee";
	}
	
	@GetMapping(path = "/getAll")
	public @ResponseBody Iterable<EmployeeEntity> getAllEmployees() {
		return employeeRepo.findAll();
	}
}
