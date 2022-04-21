package main;

public class Manager extends Employee implements AccountActionsIMPL {

	// Java Classes Inheritance is_a slide 27
	// fields
	private String timeCards;
	
	// Default Constructor
	public Manager() {
		
	}
	
	// Constructor
	public Manager(String firstName, String lastName, long empl_id, String jobTitle, String timeCards) {
		super(firstName, lastName, empl_id, jobTitle);
		this.setTimeCards(timeCards);
	}

	public String getTimeCards() {
		return timeCards;
	}

	public void setTimeCards(String timeCards) {
		this.timeCards = timeCards;
	}

	@Override
	public String toString() {
		return "Manager [timeCards=" + timeCards + "]";
	}

	@Override
	public void withdraw(float amount, float withdrawAmmount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(float amount, float depositAmmount) {
		// TODO Auto-generated method stub
		
	}
	
	public void printThis(int ...val) {
		for (int i: val) {
			System.out.println(i);
		}
	}
	
}
