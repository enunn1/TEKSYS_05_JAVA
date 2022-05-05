package com.example.ManytoOneMaven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.CohortEntity;
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
		
//		TeacherEntity t5 = new TeacherEntity();
//		t5.setTeacherName("Rick");
//		t5.setSalary("70k");
	
//		TeacherEntity t6 = new TeacherEntity();
//		t6.setTeacherName("Michelle");
//		t6.setSalary("45k");
		
//		TeacherEntity t7 = new TeacherEntity();
//		t7.setTeacherName("Sarah");
//		t7.setSalary("95k");
		
//		TeacherEntity t8 = new TeacherEntity();
//		t8.setTeacherName("James");
//		t8.setSalary("65k");
		
//		List<TeacherEntity> teacherList = new ArrayList<>();
//		teacherList.add(t5); 
//		teacherList.add(t6); 
//		teacherList.add(t7); 
//		teacherList.add(t8); 
		
//		session.save(t5);
//		session.save(t6);
//		session.save(t7);
//		session.save(t8);
		
//		DepartmentEntity dept = new DepartmentEntity();
//		dept.setDeptName("Development");
//		dept.setTeacherList(teacherList);
//		session.save(dept);
		
		CohortEntity c1 = new CohortEntity();
		c1.setCohortName("TEKSYSTEMS 05");
		c1.setDuration("12 weeks");
		
		CohortEntity c2 = new CohortEntity();
		c2.setCohortName("TEKSYSTEMS 04");
		c2.setDuration("14 weeks");
		
		CohortEntity c3 = new CohortEntity();
		c3.setCohortName("TEKSYSTEMS 02");
		c3.setDuration("16 weeks");
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		
		Set<CohortEntity> classSetOne = new HashSet<>();
		classSetOne.add(c1);
		classSetOne.add(c2);
		classSetOne.add(c3);
		
		Set<CohortEntity> classSetTwo = new HashSet<>();
		classSetTwo.add(c3);
		classSetTwo.add(c1);
		classSetTwo.add(c2);
		
		Set<CohortEntity> classSetThree = new HashSet<>();
		classSetThree.add(c3);
		classSetThree.add(c2);
		classSetThree.add(c1);
		
		TeacherEntity t1000 = new TeacherEntity();
		t1000.setTeacherName("Jimmy");
		t1000.setSalary("50k");
		t1000.setCohortSet(classSetOne);
		
		TeacherEntity t2000 = new TeacherEntity();
		t2000.setTeacherName("Kimmy");
		t2000.setSalary("50k");
		t2000.setCohortSet(classSetTwo);
		
		TeacherEntity t3000 = new TeacherEntity();
		t3000.setTeacherName("Frank");
		t3000.setSalary("50k");
		t3000.setCohortSet(classSetThree);
		
		session.save(t1000);
		session.save(t2000);
		session.save(t3000);
		
		t.commit();
		session.close();
		factory.close();
		
	}

}
