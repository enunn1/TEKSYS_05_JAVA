package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws BankingException {
		
		
		// Object & memory slide 14, 10, 8, 25
		// Object-Oriented Programming static 7
		// OOP - Casting Generics Enum slide 7
		Employee empOne = new Employee("John", "Smith", 12345, "Sales");
//		System.out.print(empOne.withdraw(200, 50));
//		System.out.print(empOne.getBankAccount());
		
		Employee empTwo = new Employee("Ethan", "Nunn", 43282, "Sales");
		
		Employee empThree = new Employee("Ethan", "Nunn", 43282);
		
		Manager managerOne = new Manager();
		managerOne.setFirstName("Bob");
		managerOne.setLastName("Marley");
		managerOne.setJobTitle("VIP");
		managerOne.setEmpl_id(98765);
		managerOne.setTimeCards("Mine");
//		managerOne.printThis(1,3,5,7,9,1776,42069);

//		System.out.println(empOne);
//		System.out.println(empTwo);
//		System.out.println(empThree);
//		System.out.println(managerOne.getEmpl_id() + managerOne.getFirstName());
		
		Box<Integer> intBox = new Box<Integer>();
//		intBox.add(234);
//		intBox.add(943);
//		intBox.add(865);
//		intBox.add(179);
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter employee id number:");
		if (userInput.hasNextLong()) {
			empOne.setEmpl_id(userInput.nextLong());
			System.out.println(empOne.getFirstName() + " " + empOne.getLastName() + "'s new account id is " 
			+ empOne.getEmpl_id());
		} else {
			userInput.close();
			throw new BankingException("Please enter a valid employee id number");
		}
		
		userInput.close();
		
//		System.out.println(intBox.get());
		
		Box<String> strBox = new Box<String>();
		strBox.add("Hi");
		strBox.add("Hello");
		
//		System.out.println(strBox.get());
		
		String str = "CHECKING";
		Accounts accOne = new Accounts(AccountTypes.valueOf(str));
//		accOne.chooseAccount();
		
//		ExampleClass.NestedClass.hello();
		
		
		
	}

}
