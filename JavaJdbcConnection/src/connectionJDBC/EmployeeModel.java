package connectionJDBC;

public class EmployeeModel {
	int employeeNumber;
	String firstName;
	String lastName;
	String jobTitle;
	String extension;

	public EmployeeModel() {
		
	}

	public EmployeeModel(int employeeNumber, String firstName, String lastName, String jobTitle, String extension) {
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.extension = extension;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	@Override
	public String toString() {
		return "EmployeeNumber: " + getEmployeeNumber()+ 
				" First name: " + getFirstName() +
				" Last name: " + getLastName()+
				" Job title: " + getJobTitle()+
				" Extension: " + getExtension();
	}
	
}
