package com.example.managementproj.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.example.managementproj.entity.UserInfo;
import com.example.managementproj.repository.UserRepository;

@Service
public class UserService implements UserServiceIMPL {

	@Autowired
	private UserRepository userRepository;
	
	public List<UserInfo> getUsers() {
		return userRepository.findAllByActiveOrderByIdDesc(true);
	}
	
	@Override
	public UserInfo getUser(Integer id) throws NotFoundException {
		return userRepository.findByIdAndActive(id, true).orElseThrow(ChangeSetPersister.NotFoundException::new);
	}

	@Override
	public UserInfo updateUser(Integer id, UserInfo user) throws NotFoundException {
		UserInfo userFromDB = getUser(id);
		userFromDB.setFirstName(user.getFirstName());
		userFromDB.setLastName(user.getLastName());
		userFromDB.setActive(user.isActive());
		return userRepository.save(userFromDB);
	}

	@Override
	public UserInfo createUser(UserInfo userEntity) {
		return userRepository.save(userEntity);
	}
}
