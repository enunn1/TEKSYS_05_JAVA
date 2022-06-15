package com.perscholas.Spring.RESTful.API.Demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.perscholas.Spring.RESTful.API.Demo.model.Employee;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

	List<Employee> findByFirstname(String firstname);
	
	List<Employee> findByIdAndLastname(Integer id, String lastname);
}