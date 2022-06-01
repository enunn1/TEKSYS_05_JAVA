package com.example.springdatademo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springdatademo.entity.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {

}
