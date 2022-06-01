package com.example.myspringdata.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.myspringdata.entity.UserEntity;
import com.example.myspringdata.repository.UserRepository;

@Controller
@RequestMapping(path = "/example") // adds a path to the URL's start /example
public class MainController {

	@Autowired
	private UserRepository userRepo;

	Logger logger = LoggerFactory.getLogger(MainController.class);

	// localhost:8080/example/add
	@PostMapping(path = "/add") // This map is for post only
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
		UserEntity newUser = new UserEntity();
		newUser.setName(name);
		newUser.setEmail(email);
		userRepo.save(newUser);
		logger.warn("Warning from pst email: " + email);
		logger.info("info from post " + email + " " + name);
		
		if (logger.isDebugEnabled() ) {
			logger.debug("debug from main controller " + newUser);
		}
		logger.debug("from post controller");
		return "Saved new user";
	}

	// localhost:8080/example/getall
	@GetMapping(path = "/getall")
	public @ResponseBody Iterable<UserEntity> getAllUsers() {
		logger.warn("getall method");
		return userRepo.findAll();
	}
}
