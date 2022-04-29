package com.perscholas.sdcmain;

import java.util.Scanner;

public class ClubMemberApp {

	public static void main(String[] args) {
		
		SoftwareDeveloperClub sdc = new SoftwareDeveloperClub("members.txt");
		Scanner userInput = new Scanner (System.in);
		
		int selection;
		
		do {
			System.out.println("Select from the following menu:\n"
					+ "1: Display Members\n"
					+ "2: Remove Member\n"
					+ "3: Add Member\n"
					+ "4: Quit");
				
			selection = userInput.nextInt();
			userInput.nextLine();
			switch (selection) {
			case 1:
				sdc.displayMembers();
				break;
			case 2:
				System.out.println("Enter the name of the member to remove: ");
				String memberName = userInput.nextLine();
				memberName = memberName.trim();
				if (sdc.delete(memberName)) {
					System.out.println("Successfully deleted member!");
				} else {
					System.out.println("Could not remove member");
				}
				break;
			case 3:
				ClubMember member = new ClubMember();
				
				System.out.println("Enter the member's name: ");
				member.setMemberName(userInput.nextLine());
				
				System.out.println("Enter the member's city: ");
				member.setCity(userInput.nextLine());
				
				System.out.println("Enter the member's state: ");
				member.setState(userInput.nextLine());
				
				System.out.println("Enter the member's favorite language: ");
				member.setFavoriteLanguage(userInput.nextLine());
				
				sdc.add(member);
				break;
			
			case 4:
				System.out.println("Goodbye!");
			}
		} while (selection != 4);
		
		userInput.close();
	}

}
