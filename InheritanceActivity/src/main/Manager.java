package main;

public class Manager extends Employee {

	public Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		basicSalary = salary;
	}

	@Override
	public void calculateTransportAllowance() {
		double transportAllowance = 0.15 * basicSalary;
		System.out.println(transportAllowance);
	}

}
