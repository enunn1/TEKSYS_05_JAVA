package com.example.springsecuritylab.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.springsecuritylab.dto.UserRegistrationDto;
import com.example.springsecuritylab.entity.User;

public interface UserService extends UserDetailsService {

	User findByEmail(String email);
	User save(UserRegistrationDto registration);

}
