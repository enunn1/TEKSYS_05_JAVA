package com.perscholas.cafe;

import java.util.Scanner;

public class Coffee extends Product {

	private boolean milk;
	private boolean sugar;
	
	
	public Coffee() {
		super();
		this.milk = false;
		this.sugar = false;
	}

	public Coffee(String name, double price, String description, boolean milk, boolean sugar) {
		super(name, price, description);
		this.milk = milk;
		this.sugar = sugar;
	}

	public boolean hasMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public boolean hasSugar() {
		return sugar;
	}

	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	@Override
	public double calculateProductTotal() {
		return this.price * this.quantity;
	}

	@Override
	public void addOptions() {
		Scanner options = new Scanner(System.in);
		
		System.out.println("How many coffees do you want?");
		this.quantity = options.nextInt();
		options.nextLine();
		
		System.out.println("Would you like milk? (Y/N)");
		if (options.nextLine().equalsIgnoreCase("Y")) {
			milk = true;
		} else {
			milk = false;
		}
		
		System.out.println("Would you like sugar? (Y/N)");
		if (options.nextLine().equalsIgnoreCase("Y")) {
			sugar = true;
		} else {
			sugar = false;
		}
	}

	@Override
	public void printOptions() {
		System.out.format("Item:\t%s\tPrice:\t$%.2f\tQty: %d\tSubtotal: $%.2f\n", 
				name, price, quantity, this.calculateProductTotal());
		
		String hasMilk = this.hasMilk() ? "Yes": "No";
		String hasSugar = this.hasSugar() ? "Yes" : "No";
		
		System.out.println("\tSugar: " + hasSugar + "\tMilk: " + hasMilk);
	}
	
	@Override
	public void addToCart(ShoppingCart cart) {
		Product p = new Coffee(name, price, description, milk, sugar);
		p.quantity = this.quantity;
		cart.add(p);
	}

}
