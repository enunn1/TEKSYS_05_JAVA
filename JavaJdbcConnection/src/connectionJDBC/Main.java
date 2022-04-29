package connectionJDBC;

public class Main {

	public static void main(String[] args) {

		EmployeeDAO employeeOne = new EmployeeDAO();
//		EmployeeModel employeeModelOne = new EmployeeModel();
//		
//		employeeModelOne = employeeOne.getEmployeeById(1286);
//		System.out.println(employeeModelOne);
		
		employeeOne.addEmployee(1777, "Johnson", "John", "x1000", 
				"jjohnson@classicmodelcars.com", "1", 1143, "Sales Rep");
		
//		EmployeeModel employeeModelTwo = new EmployeeModel(1800, "James", "Brown", "Sales Rep", "x1234");
//		employeeOne.addEmployee(employeeModelTwo);

	}

}
