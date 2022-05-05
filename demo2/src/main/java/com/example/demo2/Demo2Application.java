package com.example.demo2;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.StudentEntity;

//@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		// SpringApplication.run(Demo2Application.class, args);

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		StudentEntity student = new StudentEntity("Spongebob", "Squarepants", "spongebob@mail.com");
		StudentEntity student1 = new StudentEntity("Patrick", "Star", "patrick@mail.com");
		StudentEntity student2 = new StudentEntity("Squidward", "Tentacles", "squidward@mail.com");
		StudentEntity student3 = new StudentEntity("Eugene", "Krabs", "moneymoneymoney@mail.com");
		StudentEntity student4 = new StudentEntity("Sheldon", "Plankton", "plankton@mail.com");

		// save the student objects
		session.save(student);
		session.save(student1);
		session.save(student2);
		session.save(student3);
		session.save(student4);

		// ------------------ retrieve data from H2 database ----------------------
		String hql = "SELECT s FROM StudentEntity s";
		Query query = session.createQuery(hql);
		List<StudentEntity> list = query.getResultList();

		for (StudentEntity stu : list) {
			System.out.println("Student Id: " + stu.getId() + " | First name: " + stu.getFirstName() + " | LastName: "
					+ stu.getLastName() + " | Email: " + stu.getEmail());
		}

		session.remove(student1);
		session.remove(student4);

		t.commit();

		query = session.createQuery(hql);
		list = query.getResultList();

		for (StudentEntity stu : list) {
			System.out.println("Student Id: " + stu.getId() + " | First name: " + stu.getFirstName() + " | LastName: "
					+ stu.getLastName() + " | Email: " + stu.getEmail());
		}

	}

}
