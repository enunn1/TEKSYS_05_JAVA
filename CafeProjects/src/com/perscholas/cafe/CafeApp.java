package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		ShoppingCart shoppingCart = new ShoppingCart();
		Store cafe = new Store();
		
		cafe.add(new Coffee("Coffee", 2.95, "Coffee", false, false));
		cafe.add(new Cappuccino("Cappuccino", 4.45, "Cappuccino", false, false));
		cafe.add(new Espresso("Espresso", 3.95, "Espresso", false, false));
		
		int selection; 

		do {
			System.out.println("Please select from the following menu:");
			for (int i = 0; i <= cafe.numProducts(); i++) {
				if (i == cafe.numProducts()) {
					System.out.println((i+1) + ": Check Out");
				} else {
					System.out.println((i+1) + ": " + cafe.get(i).getName());
				}
			}
			selection = userInput.nextInt();
			if (selection == (cafe.numProducts() + 1)) {
				System.out.println("Proceed to checkout");
			} else if (selection > 0 && selection < (cafe.numProducts() + 1)) {
				Product p = cafe.get(selection - 1);
				p.addOptions();
				p.addToCart(shoppingCart);
			} else {
				System.out.println("Not a valid option");
			}
		} while (selection != (cafe.numProducts()+1));
		
		double subtotal = 0;
		for (Product p: shoppingCart.getCartItems()) {
			p.printOptions();
			subtotal += p.calculateProductTotal();
		}
		
		System.out.format("Subtotal is $%.2f\n", subtotal);
		
		double salesTax = subtotal *.06;
		System.out.format("Sales tax is $%.2f\n", salesTax);
		
		double salesTotal = subtotal + salesTax;
		System.out.format("Sales total is $%.2f\n", salesTotal);
		
		userInput.close();
		
	}
}
