package com.perscholas.cafe;

import java.util.Scanner;

public class Cappuccino extends Product {

	boolean peppermint;
	boolean whippedCream;
	
	public Cappuccino() {
		super();
		this.peppermint = false;
		this.whippedCream = false;
	}
	
	public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
		super(name, price, description);
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}

	public boolean hasPeppermint() {
		return peppermint;
	}

	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}

	public boolean hasWhippedCream() {
		return whippedCream;
	}

	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}

	@Override
	public double calculateProductTotal() {
		double productTotal = this.price * this.quantity;
		if (peppermint) productTotal += (this.quantity * 2);
		if (whippedCream) productTotal += (this.quantity);
		return productTotal;
	}

	@Override
	public void addOptions() {
		Scanner options = new Scanner(System.in);

		System.out.println("How many espressos do you want?");
		this.quantity = options.nextInt();
		options.nextLine();
		
		System.out.println("Would you like peppermint? (Y/N)");
		if (options.nextLine().equalsIgnoreCase("Y")) {
			peppermint = true;
		} else {
			peppermint = false;
		}
		
		System.out.println("Would you like whipped cream? (Y/N)");
		if (options.nextLine().equalsIgnoreCase("Y")) {
			whippedCream = true;
		} else {
			whippedCream = false;
		}
	}

	@Override
	public void printOptions() {
		System.out.println("Item: " + name + " Price: " + price + " Qty: " + quantity + " Subtotal: " 
				+ this.calculateProductTotal());
		
		String hasPeppermint = this.hasPeppermint() ? "Yes (Add $2)": "No";
		String hasWhippedCream = this.hasWhippedCream() ? "Yes (Add $1)" : "No";
		
		System.out.println("Peppermint: " + hasPeppermint + " Whipped Cream: " + hasWhippedCream);
		
	}

}
