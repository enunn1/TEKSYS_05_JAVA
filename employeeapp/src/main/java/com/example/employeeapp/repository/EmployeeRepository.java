package com.example.employeeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeeapp.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
	
}
