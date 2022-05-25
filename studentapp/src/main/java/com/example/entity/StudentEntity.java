package com.example.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Object or POJO help create our database tables
// @Table

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentEntity {

	// Setting our fields
	private String rollNo;
	private String name;

	// Creating our getters and setters
	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
