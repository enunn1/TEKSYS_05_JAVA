package com.example.demo;

import employeeDAO.FindEmployee;

//@SpringBootApplication
public class MavenDemoProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MavenDemoProjectApplication.class, args);
		
		FindEmployee employee = new FindEmployee();
		employee.findEmp();
		
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		
//		Session session = factory.openSession();
//		Transaction t = session.beginTransaction();
		
//		
//		String findUserString = "FROM employee";
//		Query q = session.createQuery(findUserString);
//		
//		List<EmployeeEntity> results = q.getResultList();
//		
//		for(EmployeeEntity e: results) {
//			System.out.println("user id: + " + e.getEmp_id() + " first name " + e.getFirstName());
//		}
		
//		EmployeeEntity employeeEntity = new EmployeeEntity();
		
//		employeeEntity.setEmp_id(1);
//		employeeEntity.setfirstName("Ethan");
//		employeeEntity.setCity("Cottage Grove");
//		employeeEntity.setEmail("ethan@example.com");
//		employeeEntity.setSalary(20);
//		
//		session.merge(employeeEntity);
		
//		EmployeeEntity employeeEntity2 = new EmployeeEntity();
		
//		employeeEntity2.setEmp_id(1);
//		employeeEntity2.setfirstName("Alice");
//		employeeEntity2.setCity("Minneapolis");
//		employeeEntity2.setEmail("alice@example.com");
//		employeeEntity2.setSalary(22);
//		
//		session.save(employeeEntity2);

//		int emp_id = 1;
//		EmployeeEntity e = session.load(EmployeeEntity.class, emp_id);
//		
//		session.delete(e);
		
//		t.commit();
//		
//		factory.close();  
//      session.close();   
		
	}

}