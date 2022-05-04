package com.example.ManytoOneMaven;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.DepartmentEntity;
import entity.TeacherEntity;

public class ManytoOneMavenApplication {

	public static void main(String[] args) {
		SessionFactory factory = 
				new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
//		DepartmentEntity it_dept = new DepartmentEntity();
//		it_dept.setDeptName("IT");
//		
//		DepartmentEntity hr_dept = new DepartmentEntity();
//		hr_dept.setDeptName("HR");
		
		TeacherEntity t5 = new TeacherEntity();
		t5.setTeacherName("Rick");
		t5.setSalary("70k");
		
		TeacherEntity t6 = new TeacherEntity();
		t6.setTeacherName("Michelle");
		t6.setSalary("45k");
		
		TeacherEntity t7 = new TeacherEntity();
		t7.setTeacherName("Sarah");
		t7.setSalary("95k");
		
		TeacherEntity t8 = new TeacherEntity();
		t8.setTeacherName("James");
		t8.setSalary("65k");
		
		List<TeacherEntity> teacherList = new ArrayList<>();
		teacherList.add(t5); 
		teacherList.add(t6); 
		teacherList.add(t7); 
		teacherList.add(t8); 
		
		session.save(t5);
		session.save(t6);
		session.save(t7);
		session.save(t8);
		
		DepartmentEntity dept = new DepartmentEntity();
		dept.setDeptName("Development");
		dept.setTeacherList(teacherList);
		session.save(dept);
		
		t.commit();
		session.close();
		factory.close();
		
	}

}
