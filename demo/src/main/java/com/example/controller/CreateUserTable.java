package com.example.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.EmployeeEntity;

public class CreateUserTable {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		
		t.commit();
		
		System.out.println("Successfully created table");
		
		factory.close();
		session.close();
	}

}
