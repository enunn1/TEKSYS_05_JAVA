package main;

public class Manager extends Employee {

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
	
	
	
}
