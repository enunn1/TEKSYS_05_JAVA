package com.example.springdatademo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeeEntity {

	// Auto create ID for user
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;

	private String firstName;
	private String lastName;
	private String jobTitle;
	private Integer salary;

	// Getters and Setters
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}
