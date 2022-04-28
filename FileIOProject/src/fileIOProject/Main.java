package fileIOProject;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// Java Files and Java IO: slide 7, 30, 37, 53
		// Absolute Path
		// Relative Path

		// Byte Streams perform in and out of 8-bit bytes

//		FileReader in = null;
//		FileWriter out = null;
//
//		try {
//			in = new FileReader("input.txt");
//			out = new FileWriter("output.txt");
//
//			int num;
//
//			while ((num = in.read()) != -1) {
//				out.write(num);
//			}
//		} finally {
//			if (in != null) {
//				in.close();
//				System.out.println("ran in");
//			}
//			if (out != null) {
//				out.close();
//				System.out.println("ran out");
//			}
//		}
//		
//		InputStreamReader streamIn = null;
//		
//		try {
//			streamIn = new InputStreamReader(System.in);
//			System.out.println("Enter Q to quit");
//			
//			char Q;
//			do {
//				Q = (char) streamIn.read();
//				System.out.println(Q);
//			} while (Q != 'Q');
//		} finally {
//			if (streamIn != null) {
//				streamIn.close();
//			}
//		}

		// Character Streams
		// Standard Streams
		// Reading & Writing Files

//		String path = "newfile.csv";
//		try {
//			File file = new File(path);
//			Scanner input = new Scanner(file);
//			ArrayList<Course> data = new ArrayList<>();
//
//			while (input.hasNextLine()) {
//				String[] line = input.nextLine().split(",");
//				data.add(new Course(line[0], line[1], line[2]));
//			}
//			
//			for (Course c: data) {
//				System.out.format("%-15s | %-35s | %-25s\n",
//						c.getCode(), c.getName(), c.getInstructor());
//			}
//			
//			input.close();
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("No file here:");
//			e.printStackTrace();
//		}

//		System.out.println(file.isDirectory());
//
//		// return an array of files
//		File[] FilewithPath = file.listFiles();
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("What is your name?");
			String name = reader.readLine();
			
			System.out.println("What\'s yout job?");
			String job = reader.readLine();
			
			System.out.format("%s, %s", name, job);
			
			reader.close();
			
		} catch(IOException ioe) {
			System.out.println("IO in bufferedReader in main");
			ioe.printStackTrace();
		}
	}

}
