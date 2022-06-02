package com.example.managementproj.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.managementproj.entity.UserEntity;
import com.example.managementproj.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping(value="/list-users")
	public String showUsers(Model model) {
		List<UserEntity> users = userService.getAllUsers();
		model.addAttribute("users", users);
		model.addAttribute("users", new UserEntity());
		return "user";
	}
	
	@PostMapping(value="/add_user")
	public String addUser(ModelMap model, @Valid UserEntity userEntity, BindingResult result) {
		if (result.hasErrors()) {
			return "userEntity";
		}
		userService.addUser(userEntity);
		
		
		return "redirect:/";
		
	}
	
}
