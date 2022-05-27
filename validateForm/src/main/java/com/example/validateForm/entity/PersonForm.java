package com.example.validateForm.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

	@NotNull
	@Size(min=2,max=40)
	private String name;
	
	@NotNull
	@Min(18)
	private Integer age;

	public PersonForm(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person: " + "name=" + name + ", age=" + age + "]";
	}
}
