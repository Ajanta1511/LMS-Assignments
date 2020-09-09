package com.manipal.model;

public class User {
	
	private int athleteId;
	private String athleteName;
	private String athleteGender;
	private String category;
	private String athleteEmail;
	private String athleteMobile;
	public int getAthleteId() {
		return athleteId;
	}
	public void setAthleteId(int athleteId) {
		this.athleteId = athleteId;
	}
	public String getAthleteName() {
		return athleteName;
	}
	public void setAthleteName(String athleteName) {
		this.athleteName = athleteName;
	}
	public String getAthleteGender() {
		return athleteGender;
	}
	public void setAthleteGender(String athleteGender) {
		this.athleteGender = athleteGender;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAthleteEmail() {
		return athleteEmail;
	}
	public void setAthleteEmail(String athleteEmail) {
		this.athleteEmail = athleteEmail;
	}
	public String getAthleteMobile() {
		return athleteMobile;
	}
	public void setAthleteMobile(String athleteMobile) {
		this.athleteMobile = athleteMobile;
	}
	

}


//CREATE TABLE USER (USERNAME VARCHAR(25) NOT NULL, LOCATION VARCHAR(25) );

