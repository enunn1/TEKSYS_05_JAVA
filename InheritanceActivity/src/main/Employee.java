package main;

public class Employee {

	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	protected double basicSalary;
	private double specialAllowance = 250.80;
	private double hra = 1000.50;
	
	public Employee (long id, String name, String address, long phone) {
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
	public void calculateSalary() {
		double salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary *
				hra/100);
		System.out.println(salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 0.10 * basicSalary;
		System.out.println(transportAllowance);
	}
}
