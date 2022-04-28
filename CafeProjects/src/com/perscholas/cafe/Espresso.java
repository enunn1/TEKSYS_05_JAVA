package com.perscholas.cafe;

import java.util.Scanner;

public class Espresso extends Product {
	
	boolean extraShot;
	boolean macchiato;
	
	public Espresso() {
		super();
		this.extraShot = false;
		this.macchiato = false;
	}
	
	public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
		super(name, price, description);
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}

	public boolean hasExtraShot() {
		return extraShot;
	}

	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	public boolean isMacchiato() {
		return macchiato;
	}

	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}

	@Override
	public double calculateProductTotal() {
		double productTotal = this.price * this.quantity;
		if (extraShot) productTotal += (this.quantity * 2);
		if (macchiato) productTotal += (this.quantity);
		return productTotal;
	}

	@Override
	public void addOptions() {
		Scanner options = new Scanner(System.in);

		System.out.println("How many espressos do you want?");
		this.quantity = options.nextInt();
		options.nextLine();
		
		System.out.println("Would you like an extra shot? (Y/N)");
		if (options.nextLine().equalsIgnoreCase("Y")) {
			extraShot = true;
		} else {
			extraShot = false;
		}
		
		System.out.println("Make it a macchiato? (Y/N)");
		if (options.nextLine().equalsIgnoreCase("Y")) {
			macchiato = true;
		} else {
			macchiato = false;
		}
	}

	@Override
	public void printOptions() {
		System.out.format("Item:\t%s\tPrice:\t$%.2f\tQty: %d\tSubtotal: $%.2f\n", 
				name, price, quantity, this.calculateProductTotal());
		
		String hasExtraShot = this.hasExtraShot() ? "Yes (Add $"+((int) 2*quantity)+")": "No";
		String hasMacchiato = this.isMacchiato() ? "Yes (Add $"+((int) quantity)+")" : "No";
		
		System.out.println("\tExtra Shot: " + hasExtraShot + "\tMacchiato: " + hasMacchiato);
		
	}
	
	@Override
	public void addToCart(ShoppingCart cart) {
		Product p = new Espresso(this.name, this.price, this.description, this.extraShot, this.macchiato);
		p.quantity = this.quantity;
		cart.add(p);
	}

}
