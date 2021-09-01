package com.cs104.strings;

import java.util.LinkedList;

public class FullName {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private char middleInitial;
	
	public static LinkedList<String> FirstName = new LinkedList<String>();
	public static LinkedList<String> MiddleName = new LinkedList<String>();
	public static LinkedList<String> LastName = new LinkedList<String>();	
	
	public FullName() {
		this.firstName = "Dummy First Name";
		this.middleName = "DummyMiddleName";
		this.lastName = "Dummy LastName";
		this.middleInitial = ' ';
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		FirstName.add(firstName);
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
		LastName.add(lastName);
	}
	
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
		MiddleName.add(middleName);
	}
	public char getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial (char middleInitial) {
		this.middleInitial = middleInitial;
	}
	//TODO create a method that will return the Middle Initial
}