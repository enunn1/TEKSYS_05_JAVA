package com.example.Thymeleafproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.Thymeleafproject.entity.UserEntity;

@Controller
public class UserController {

	// making a request
	@GetMapping(value="/")
	public String index() { // handle method
		return "index"; // return an html doc to the screen
	}
	
	@RequestMapping(value="/profile", method = RequestMethod.POST)
	public ModelAndView profile(@ModelAttribute UserEntity userEntity) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("profile"); // view it on our profile.html page
		modelAndView.addObject("UserEntity", userEntity); // access to the data from the userEntity
		return modelAndView;
	}
	
}
