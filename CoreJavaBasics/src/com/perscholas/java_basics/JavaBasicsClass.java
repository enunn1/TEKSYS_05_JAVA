package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {

		int xInt = 4;
		int yInt = 6;
		int sumInt = xInt + yInt;
		System.out.println(sumInt);

		double xDouble = 1.23;
		double yDouble = 564.214;
		double sumDouble = xDouble + yDouble;
		System.out.println(sumDouble);

		// The sum must be a double variable type
		int a = 54;
		double b = 14.82;
		double c = a + b;
		System.out.println(c);

		/*
		 * An error occurs when the larger number is changed to a decimal. To correct
		 * this, the variable d and the variable f must have their types changed from
		 * int to double
		 * 
		 */
		double d = 72.9;
		int e = 10;
		double f = d / e;
		System.out.println(f);
		
		double g = 111.11;
		double h = 32.9;
		double i = g / h;
		System.out.println(i);
		int j = (int) (g/h);
		System.out.println(j);
		
		int x = 5;
		int y = 6;
		double q = y/x;
		System.out.println(q);
		q = (double) y/x;
		System.out.println(q);
		
		final double PI = 3.14159;
		double radius = 7.0;
		double area = radius * radius * PI;
		System.out.println(area);
		
		float coffee = 2.99f;
		float cappuccino = 3.99f;
		float espresso = 3.49f;
		
		float subtotal;
		float totalSale;
		
		subtotal = 3 * coffee + 4 * cappuccino + 2 * espresso;
		
		float SALES_TAX = 1.50f;
		
		totalSale = subtotal + SALES_TAX;
		
		System.out.println(totalSale);
	}

}
