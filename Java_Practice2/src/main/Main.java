package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		int num = 12;
		int otherNum = 7;

		boolean isEven = num % 2 == 0;

		if ((num % 2 == 0) && (num % 3 == 0)) {
			System.out.println("even from the top");
		}

		int age = 21;

		if (age > 15 && age < 18) {
			System.out.println("in range");
		} else if (age > 18 & age < 25) {
			System.out.println("in range over the age of 18");
		} else {
			System.out.println("Not in range");
		}

//		System.out.println("Hi, what is your name? ");
//		String firstName = userInput.nextLine();
//
//		System.out.println("What is your age? ");
//		int userAge = userInput.nextInt();
//
//		if (userAge > 17) {
//			System.out.println(firstName + ", you may pass");
//		} else {
//			System.out.println("Sorry " + firstName + ", you are not old enough");
//		}

		userInput.close();

		int day = 1;

		switch (day) {
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tues");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thur");
			break;
		default:
			System.out.println("On break");
			break;
		}

		// ternary operator

//		boolean exp = (3 <= 10) ? true : false;
//		System.out.println(exp);

		// loops
		// while loop
//		boolean flag = true;
//		int count = 1;
//		while(count <= 20) {
//			System.out.println(count+"welcome");
//			count++;
//		}

		// do while loop
//		int count = 3;
//		do {
//			System.out.println(count);
//			count++;
//		} while (count <= 0);
		// int j = 0, count = 10, score = 36;
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i + " count");
//		}
//		for (int i = 0, j = 0; (i + j < 10); i++, j++) {
//			System.out.println(i + j);
//		}
		for (int i = 10; i > 0; i--) {
			System.out.println("count " + i);
			for (int j = 1; j <= 5; j *= 2) {
				System.out.println(j);
			}
		}
	}

}
