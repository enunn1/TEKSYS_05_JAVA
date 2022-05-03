package com.example.demo.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.User;

public class DeletingUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		User u = new User();
		u.setEmp_id(3);
		session.delete(u);
		tx.commit();
		session.close();
		factory.close();
	}
}
