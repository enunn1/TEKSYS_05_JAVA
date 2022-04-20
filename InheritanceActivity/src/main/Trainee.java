package main;

public class Trainee extends Employee {

	public Trainee(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		super.basicSalary = salary;
	}
}
