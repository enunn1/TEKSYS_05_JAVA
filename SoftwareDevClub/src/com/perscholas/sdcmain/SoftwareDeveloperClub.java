package com.perscholas.sdcmain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareDeveloperClub {

	private ArrayList<ClubMember> members;

	public SoftwareDeveloperClub() {
		members = new ArrayList<>();
	}
	
	public SoftwareDeveloperClub(String filename) {
		this();
		File file = new File(filename);
		Scanner input;
		try {
			input = new Scanner(file);
			input.nextLine();
			while (input.hasNextLine()) {
				String[] line = input.nextLine().split("[*][*]");
				members.add(new ClubMember(line[0], line[1], line[2], line[3]));
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Exception in SoftwareDeveloperClub class");
			e.printStackTrace();
		}		
	}

	public ArrayList<ClubMember> getMembers() {
		return members;
	}
	
	public void displayMembers() {
		for (ClubMember member: members) {
			System.out.println(member +"\n");
		}
	}
	
	public boolean add(ClubMember member) {
		return members.add(member);
	}
	
	public boolean delete(String memberName) {
		for (ClubMember member: members) {
			if (member.getMemberName().equals(memberName)) {
				return members.remove(member);
			}
		}
		return false;	
	}

}
