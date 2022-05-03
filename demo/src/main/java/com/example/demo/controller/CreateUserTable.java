package com.example.demo.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.User;

public class CreateUserTable {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		User user = new User();
		
		t.commit();
		
		System.out.println("Successfully created table");
		
		factory.close();
		session.close();
	}

}
