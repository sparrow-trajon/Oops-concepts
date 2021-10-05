package com.sparrow.oops.model;

public class User {
	// entitiy class / model class
	//Data Hiding 
	
	private int id;
	private String userId;
	private  String name;
	private String email;
	private  long phoneNo;
	
	
	//getter to get these values 
	// setter to set these values 
	
	public int getId() {
		
		// code accordingly 
		//deny access to pankaj 
		//deny access to isha
		return id;
	}
	
	public String getUserId() {
		return userId;
		
	}
	
	public void setId(int id) {
		this.id=id;
		
	}

}
