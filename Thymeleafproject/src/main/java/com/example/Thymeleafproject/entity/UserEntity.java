package com.example.Thymeleafproject.entity;

//import javax.persistence.Entity;

//@Entity
public class UserEntity {

	private String name;
	private String email;

	public UserEntity(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public UserEntity() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
