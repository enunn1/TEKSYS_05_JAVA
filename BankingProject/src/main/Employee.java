package main;

public class Employee extends AbstractAccountActions {

	// Fields Java classes slide 14
	// Encapsulation slide 3
	// Method Declarations slide 7-8, 16-23
	// DRY (Don't Repeat Yourself)
	private String firstName;
	private String lastName;
	private long empl_id;
	private String jobTitle;
	private float totalAmount;
	// protected
	
	// Default Constructor
	public Employee() {
		
	}
	
	// Constructor
	public Employee(String firstName, String lastName, long empl_id, String jobTitle) {		
		this.firstName = firstName;
		this.lastName = lastName;
		this.empl_id = empl_id;
		this.jobTitle = jobTitle;
	}
	
	public Employee(String firstName, String lastName, long empl_id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.empl_id = empl_id;
	}
	
	public Employee(String firstName, long empl_id) {
		this.firstName = firstName;
		this.empl_id = empl_id;
	}

	// Getters & Setters
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

	public long getEmpl_id() {
		return empl_id;
	}

	public void setEmpl_id(long empl_id) {
		this.empl_id = empl_id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	@Override
	public String toString() {
		return "Employee ["
				+ "firstName=" + firstName 
				+ ", lastName="+ lastName 
				+ ", empl_id=" + empl_id 
				+ ", jobTitle="+ jobTitle + "]";
	}
	
	// other methods
	@Override
	float withdraw(int amount, int withdrawAmount) {
		totalAmount = amount - withdrawAmount;
		return totalAmount;
	}

	@Override
	float deposit(int amount, int depositAmount) {
		totalAmount = amount + depositAmount;
		return totalAmount;
	}
	
	
}
