package com.cs104.strings;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;  
import java.util.Date;
import java.util.LinkedList;
import java.text.ParseException;
import java.text.SimpleDateFormat; 



public class UserProfile extends FullName {
	private final String userID;
	private FullName userFullName;
	private Date userBirthDate;
	private Date userEnterDateTime;
	private String userPhoneNumber;
	
	
	  LinkedList<String> phoneNumber = new LinkedList<String>();
	LinkedList<Date> dateTime = new LinkedList<Date>();	
	 LinkedList<String> UserID = new LinkedList<String>();
	//default constructor
	public UserProfile() {
		this.userID = NameGenerator.randomUserID();
		//TODO use the static method NameGenerator.randomUserID
		//to initialize a random userID on the newly created user
		this.userFullName = new FullName();
		this.userBirthDate = new Date();
		this.userEnterDateTime = new Date();
	}
	
	
	public void setBirthDate (String BirthDate) throws ParseException {
		String sDate1= BirthDate;  
	    Date date1=new SimpleDateFormat("MM/dd/yyyy").parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1);  
		
	} 
	
	public Date getBirthDate () {
		return userBirthDate;
	}
	
	public void setPhoneNumber (String PhoneNumber) {
		this.userPhoneNumber = PhoneNumber;
		if (PhoneNumber.length() < 11) {
			 System.out.println("ERROR"); 
		}
		else if (PhoneNumber.length() < 11) {
			 System.out.println("ERROR"); 
		}
		phoneNumber.add(PhoneNumber);
	}
	
		
	public String getPhoneNumber () {
		return userPhoneNumber;
	
	}
	

	
	public Date getEnterDateTime () {
		dateTime.add(new Date());
		Date userEnterDateTime =  new Date();
		SimpleDateFormat timeFormat = new SimpleDateFormat ("hh:mm:ss");
		System.out.println(timeFormat.format(userEnterDateTime));
		return userEnterDateTime;	
	
	}
	
	public void userID(String identity) {
		this.UserID.add(identity);
		
	}
	
	public void displayUserID(int display) {
		this.UserID.get(display);
	}
	
	
	public void searchNumber (String PhoneNumber) {
		if (this.phoneNumber.contains(PhoneNumber)) {
			for (int i = 0; i < this.phoneNumber.size(); i++ ) {
				if (PhoneNumber.equals (this.phoneNumber.get(i))) {
					 System.out.println(this.UserID.get(0));
					 System.out.println(userPhoneNumber);
					 System.out.println(userEnterDateTime); 
				} 
			}
		}
	}
	
	public void searchDateandTime (String EnterDateTime) {
		String[] split = EnterDateTime.split("-", 3);

		for (int i = 0; i < this.dateTime.size(); i++) {
			LocalDate date = LocalDate.parse( new SimpleDateFormat("yyyy-MM-dd").format(this.dateTime.get (i)) );
	
		    
		    if (Integer.parseInt(split[0]) == date.getYear() && Integer.parseInt(split[1]) == date.getMonthValue() && Integer.parseInt(split[2]) == date.getDayOfMonth()) {
		
	 
					 System.out.println(this.UserID.get(0));
					 System.out.println(userPhoneNumber);
					 System.out.println(userEnterDateTime); 
				
			}
		}
		    
		
	
	}
	
	public void searchFirstName (String firstName) {
		
	
		if (FullName.FirstName.contains(firstName)) {
			for (int i = 0; i < FullName.FirstName.size(); i++) {
				if (firstName.equals (FullName.FirstName.get(i))) {
					 System.out.println(this.UserID.get(0));
					 System.out.println(userPhoneNumber);
					 System.out.println(userEnterDateTime); 
				} 
			}
		}
	}
	
	public void searchMiddleName (String middleName) {
		
		
		if (FullName.MiddleName.contains(middleName)) {
			for (int i = 0; i < FullName.MiddleName.size(); i++ ) {
				if (middleName.equals (FullName.MiddleName.get(i))) {
					 System.out.println(this.UserID.get(0));
					 System.out.println(userPhoneNumber);
					 System.out.println(userEnterDateTime); 
				} 
			}
		}
	}
	
	public void searchLastName (String lastName) {
		if (FullName.LastName.contains(lastName)) {
			for (int i = 0; i < FullName.LastName.size(); i++ ) {
				if (lastName.equals (FullName.LastName.get(i))) {
					 System.out.println(this.UserID.get(0));
					 System.out.println(userPhoneNumber);
					 System.out.println(userEnterDateTime); 
				} 
			}
		}
	}
	
	
	//TODO create accessors and mutators for the following conditions
	//1. userID can not be modified by any class, but can be accessed
	//2. userFullName can be modified and accessed by any class, however
	//	you need to create:
	//		a. four (4) getters for the full name, only first name, only middle name, and only last name.
	//		b. two (2) setters for the full name using the FullName Class and using the strings
	//			first name, middle name, and last name
	//3. userBirthDate can be modified and accessed by any class
	//4. userCreateDate can be only accessed
}
