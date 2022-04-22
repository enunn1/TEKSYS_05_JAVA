package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
	// Exceptions
	// 
	public static void main(String[] args) {
		// Checked Exception
		// FileNotFoundException
		
		File myFile = new File("text.txt");
		
		try {
			FileReader fr = new FileReader(myFile);
			
			int[] num = {1, 2, 3, 4};
			System.out.println(num[1]);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ea) {
			ea.printStackTrace();
		} finally {
			System.out.println("Everything is working");
		}


		
//		try {
//			// try this
//		} catch {
//			// Catch exception
//		}
	}
	
	static double balance = 200.0;
	
	public static void withdraw(double amount) throws CustomExceptionFile {
		if (amount <= balance) {
			balance -= amount;
		} else {
			double accountBelow = amount - balance;
			throw new CustomExceptionFile(accountBelow);
		}
	}

}
