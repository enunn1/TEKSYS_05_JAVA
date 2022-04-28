package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		ShoppingCart shoppingCart = new ShoppingCart();
		
		int selection; 
		do {
			System.out.println("Please select from the following menu:");
			System.out.println("1: Coffee");
			System.out.println("2: Cappuccino");
			System.out.println("3: Espresso");
			System.out.println("4: Check Out");
			selection = userInput.nextInt();
			switch (selection) {
			case 1:
				Product coffee = new Coffee("Coffee", 2.95, "Coffee", false, false);
				coffee.addOptions();
				shoppingCart.add(coffee);
				break;
			case 2:
				Product cappuccino = new Cappuccino("Cappuccino", 4.45, "Cappuccino", false, false);
				cappuccino.addOptions();
				shoppingCart.add(cappuccino);
				break;
			case 3:
				Product espresso = new Espresso("Espresso", 3.95, "Espresso", false, false);
				espresso.addOptions();
				shoppingCart.add(espresso);
				break;
			case 4: 
				System.out.println("Proceed to checkout");
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		} while (selection != 4);
		
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
