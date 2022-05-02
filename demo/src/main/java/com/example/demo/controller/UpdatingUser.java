package com.example.demo.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.EmployeeEntity;

public class UpdatingUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		EmployeeEntity u = new EmployeeEntity();
		u.setEmp_id(3);
		u.setEmail("mhaseeb@perscholas");
		u.setFullName("M haseeb");
		u.setPassword("123456");
		session.merge(u);
		session.getTransaction().commit();
		session.close();
	}
}
