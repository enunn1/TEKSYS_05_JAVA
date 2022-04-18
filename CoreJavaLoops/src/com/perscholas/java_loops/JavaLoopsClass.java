package com.perscholas.java_loops;

public class JavaLoopsClass {

	public static void main(String[] args) {

//		for (int count = 1; count <= 10; count++) {
//			System.out.println(count);
//		}

//		int count = 0;
//		while (count <= 100) {
//			System.out.println(count);
//			count += 10;
//		}

//		int count = 1;
//		do {
//			System.out.println(count);
//			count++;
//		} while (count <= 10);

//		for (int count = 1; count <= 100; count++) {
//			if (count % 5 != 0 || (count >= 25 && count <= 75)) {
//				continue;
//			} else {
//				System.out.println(count);
//			}
//		}

//		for (int count = 1; count <= 100; count++) {
//			if (count > 50) {
//				break;
//			} else if (count % 5 == 0) {
//				System.out.println(count);
//			}
//		}

//		for (int week = 1; week <= 2; week++) {
//			System.out.println("Week " + week + ":");
//			for (int day = 1; day <= 5; day++) {
//				System.out.println("Day " + day);
//			}
//		}

//		for (int count = 10; count < 200; count++) {
//			String numberString = Integer.toString(count);
//			if (numberString.charAt(0) == numberString.charAt(numberString.length() - 1)) {
//				System.out.println(count);
//			}
//		}

//		int x = 0;
//		int y = 1;
//		while (x < 50) {
//			System.out.print(x +", ");
//			int sum = x + y;
//			x = y;
//			y = sum;
//		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.println("inner loop i: " + i + ", j: " + j);
			}
		}
	}

}
