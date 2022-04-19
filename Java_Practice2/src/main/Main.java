package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

//		int num = 11;
//		int otherNum = 7;
//
//		boolean isEven = num % 2 == 0;
//
//		if ((num % 2 == 0) && (num % 3 == 0)) {
//			System.out.println("even from the top");
//		}

//		int age = 21;
//
//		if (age > 15 && age < 18) {
//			System.out.println("in range");
//		} else if (age > 18 & age < 25) {
//			System.out.println("in range over the age of 18");
//		} else {
//			System.out.println("Not in range");
//		}

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

//		userInput.close();

//		int day = 1;
//
//		switch (day) {
//		case 1:
//			System.out.println("Mon");
//			break;
//		case 2:
//			System.out.println("Tues");
//			break;
//		case 3:
//			System.out.println("Wed");
//			break;
//		case 4:
//			System.out.println("Thur");
//			break;
//		default:
//			System.out.println("On break");
//			break;
//		}

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
//		for (int i = 10; i > 0; i--) {
//			System.out.println("count " + i);
//			for (int j = 1; j <= 5; j *= 2) {
//				System.out.println(j);
//			}
//		}
		
//		String[] myStr = new String[10];
//		String[] myStr2 = {"Ethan", "hello"};
//		myStr[0]= "Ethan";
//		myStr[1]= "hello";
//		myStr[2]= myStr[0] + " " + myStr[1];
//		System.out.print(myStr[2]);
		
//		int[] myInt = new int[10];
//		for (int i = 1; i < 10; i++) {
//			myInt[i] = i + myInt[i-1];
////			System.out.println(myInt[i]);
//		}
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(myInt[i]);
//		}
		
		// Enhanced for loop
//		for (int i: myInt) {
//			System.out.println(i);
//		}
		
//		int[] copyOfArr = myInt.clone();
//		
//		myInt[0] = 234;
//		
//		System.out.println("copy: " + Arrays.toString(copyOfArr));
//		System.out.println("og: "+ Arrays.toString(myInt));
		
//		int n;
//		System.out.println("Enter the number of elements you want to store: ");
//		
//		n = userInput.nextInt();
//		
//		int[] arr = new int[n];
//		System.out.println("Enter the elements of the array: ");
//		
//		for (int i = 0; i < n; i++) {
//			arr[i]=userInput.nextInt();
//		}
//		
//		System.out.println("Array elements are: ");
//		for (int i=0; i<n; i++) {
//			System.out.println(arr[i]); 
//		}
		
//		double[] arr = new double[5];
//		for (int i = 0; i < 5; i++) {
//			arr[i] = Math.floor(Math.random() * 10);
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
		int[] numbers = {12, 3, 4, 5, -5, 0};
		
//		int sum = 0;
//		
//		for (int number : numbers) {
//			sum += number;
//		}
//		
//		System.out.print(sum);
		
		double max = numbers[0];
		int maxIdx = 0;
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				maxIdx = i;
			}
		}
		
		System.out.print(maxIdx);
		
	}

}
