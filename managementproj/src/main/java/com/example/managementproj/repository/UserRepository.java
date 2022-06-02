package com.example.managementproj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.example.managementproj.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	//@Query("Select user from userTable")
	List<UserEntity> findByUserName(String user);
}
