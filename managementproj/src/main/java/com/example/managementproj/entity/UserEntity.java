package com.example.managementproj.entity;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String username;

	@Size(min = 15, message = "Enter at least 15 characters")
	private String description;

	private Date targetDate;

	public UserEntity() {
	}

	public UserEntity(String username, String description, Date targetDate) {
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

}
