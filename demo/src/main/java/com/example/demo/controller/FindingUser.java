package com.example.demo.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.User;

public class FindingUser {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
	      
	    int USER_ID = 2;
	    User employee = session.load(User.class, USER_ID);
	    System.out.println("Fullname: " + employee.getFullName());
	    System.out.println("Email: " + employee.getEmail());
	    System.out.println("password: " + employee.getPassword());

	    //Close resources
	     tx.commit();
	     factory.close();
	     session.close();


	}

}
