package com.perscholas.sdcmain;

public class ClubMember {

	private String memberName;
	private String city;
	private String state;
	private String favoriteLanguage;

	public ClubMember() {
	}

	public ClubMember(String memberName, String city, String state, String favoriteLanguage) {
		this.memberName = memberName;
		this.city = city;
		this.state = state;
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	@Override
	public String toString() {
		return "Member Name: " + this.memberName + 
				"\nLocation: " + this.city + ", " + this.state +
				"\nFavorite Language: " + this.favoriteLanguage;
	}

}
