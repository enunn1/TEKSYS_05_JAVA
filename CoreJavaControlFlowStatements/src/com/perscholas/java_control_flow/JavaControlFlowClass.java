package com.perscholas.java_control_flow;

import java.util.Scanner;

public class JavaControlFlowClass {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

//		int x = 15;
//		if (x < 10) {
//			System.out.println("Less than 10");
//		}

//		int x = 15;
//		if (x < 10) {
//			System.out.println("Less than 10");
//		} else {
//			System.out.println("Greater than 10");
//		}

//		int x = 50;
//		if (x < 10) {
//			System.out.println("Less than 10");
//		} else if (x > 10 && x < 20){
//			System.out.println("Between 10 and 20");
//		} else if (x > 20) {
//			System.out.println("Greater than 20");
//		}

//		int x = 5;
//		if (x < 10 || x > 20) {
//			System.out.println("Out of range");
//		} else if (x >= 10 && x <= 20){
//			System.out.println("In range");
//		}

//		System.out.println("Enter number score: ");
//		int score = userInput.nextInt();
//		if (score >= 90 && score <= 100) {
//			System.out.println("A");
//		} else if (score >= 80 && score <= 89) {
//			System.out.println("B");
//		} else if (score >= 70 && score <= 79) {
//			System.out.println("C");
//		} else if (score >= 60 && score <= 69) {
//			System.out.println("D");
//		} else if (score >= 0 && score < 60) {
//			System.out.println("F");
//		} else {
//			System.out.println("Out of range");
//		}
		
		System.out.println("Enter a value between 1 & 7");
		int day = userInput.nextInt();
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Out of range");
			break;
		}
		

		userInput.close();
	}

}
