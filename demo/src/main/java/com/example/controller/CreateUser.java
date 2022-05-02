package com.example.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.EmployeeEntity;

public class CreateUser {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	
    	Transaction t = session.beginTransaction();   
    	EmployeeEntity empOne = new EmployeeEntity();
    	empOne.setEmail("haseeb@gmail.com");
    	empOne.setFullName("Moh Haseeb");
    	empOne.setPassword("has123");
    	empOne.setSalary(2000.69);
    	empOne.setAge(20);
    	empOne.setCity("NYC");
    	
    	EmployeeEntity empTwo = new EmployeeEntity();
    	empTwo.setEmail("James@gmail.com");
    	empTwo.setFullName("James Santana");
    	empTwo.setPassword("James123");
    	empTwo.setSalary(2060.69);
    	empTwo.setAge(25);
    	empTwo.setCity("Dallas");
    	
    	EmployeeEntity empThree = new EmployeeEntity();
    	empThree.setEmail("Shahparan@gmail.com");
    	empThree.setFullName("AH Shahparan");
    	empThree.setPassword("Shahparan123");
    	empThree.setSalary(3060.69);
    	empThree.setAge(30);
    	empThree.setCity("Chicago");
    	
  /*========= We can pass value/data by using constructor =========*/
    	EmployeeEntity empfour = new EmployeeEntity("Christ", "christ@gmail.com",  "147852", 35, 35000.3,"NJ");
    	EmployeeEntity empfive = new EmployeeEntity("Sid", "Sid", "s258", 29, 4000.36, "LA");
    	Integer emp_id = null;
    	session.save(empOne); 
    	session.save(empTwo); 
    	session.save(empThree); 
    	session.save(empfour); 
    	session.save(empfive); 
    	  
        t.commit();
        System.out.println("successfully saved");   
        factory.close();  
        session.close();    
	}
}
