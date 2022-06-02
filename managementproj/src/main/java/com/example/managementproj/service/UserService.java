package com.example.managementproj.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.managementproj.entity.UserEntity;
import com.example.managementproj.repository.UserRepository;

@Service
public class UserService implements UserServiceImpl {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public List<UserEntity> getUserByUsername(String user) {
		return userRepository.findByUserName(user);
	}

	@Override
	public Optional<UserEntity> getUsernameById(long id) {
		return userRepository.findById(id);
	}

	@Override
	public void updateUser(UserEntity user) {
		userRepository.save(user);
	}
	
	@Override
	public void addUser(UserEntity userEntity) {
		userRepository.save(userEntity);
	}

	@Override
	public void addUser(String username, String desc, Date targetDate) {
		userRepository.save(new UserEntity(username, desc, targetDate));
	}

	@Override
	public void deleteUser(long id) {
		Optional<UserEntity> user = userRepository.findById(id);
		if (user.isPresent()) {
			userRepository.delete(user.get());
		}
	}

	@Override
	public void saveUser(UserEntity user) {
		userRepository.save(user);
	}

	

}
