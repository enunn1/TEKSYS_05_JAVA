package main;

public class Main {

	public static void main(String[] args) {
		
		// Object & memory slide 14, 10, 8
		// Object-Oriented Programming static 7
		Employee empOne = new Employee("John", "Smith", 12345, "Sales");
		
		Employee empTwo = new Employee("Ethan", "Nunn", 43282, "Sales");
		
		Employee empThree = new Employee("Ethan", "Nunn", 43282);
		
		Manager managerOne = new Manager();
		managerOne.setFirstName("Bob");
		managerOne.setLastName("Marley");
		managerOne.setJobTitle("VIP");
		managerOne.setEmpl_id(98765);
		managerOne.setTimeCards("Mine");

		System.out.println(empOne);
		System.out.println(empTwo);
		System.out.println(empThree);
		System.out.println(managerOne.getEmpl_id());
		
	}

}
