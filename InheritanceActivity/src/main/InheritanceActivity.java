package main;

public class InheritanceActivity {

	public static void main(String[] args) {

		Employee manager1 = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		Employee trainee1 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		
		manager1.calculateSalary();
		trainee1.calculateSalary();
		
		manager1.calculateTransportAllowance();
		trainee1.calculateTransportAllowance();
		
	}

}
