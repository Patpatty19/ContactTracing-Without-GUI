package com.cs104.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.ParseException;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args)  throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		
		FullName FullName = new FullName();
		UserProfile UserProfile = new UserProfile();
	

char letter = ' ';
String password = "covid"; //here is the password sir

	do {
		System.out.println("Welcome to Patrick's Store"); 
		System.out.println ("Please fill up the information below for contract tracing against COVID-19 ");
		System.out.println ("Select an option below");
		System.out.println ("v > Visitor ");
		System.out.println ("a > Administrator ");
		System.out.println ("q > Quit ");
		letter = reader.readLine().charAt(0);
		
		
		switch (letter) {	
	case 'v':
		

		System.out.println("Enter your first name:"); 
		FullName.setFirstName(reader.readLine());
		System.out.println("Enter your middle name:"); 
		FullName.setMiddleName(reader.readLine());
		System.out.println("Enter your middle initial:"); 
		FullName.setMiddleInitial(reader.readLine().charAt(0));
		System.out.println("Enter your last name:");
		FullName.setLastName(reader.readLine());
		
		System.out.println("When is your birthdate:"); 
		UserProfile.setBirthDate(reader.readLine());
		
		System.out.println("Enter your 11 digit phone number:");
		UserProfile.setPhoneNumber(reader.readLine());
		
		System.out.println("This is your ID:");
		String ID = NameGenerator.randomUserID();
		System.out.println(ID);
		UserProfile.userID(ID);
		UserProfile.displayUserID(0);
		
		System.out.println("The time is:");
		System.out.println(UserProfile.getEnterDateTime());
		System.out.println("The form has been completed you may now enter Patrick's store! ");
		 break; 
		 
	case 'a': 

		System.out.println("Enter the password: ");
		password = reader.readLine();
		
		
			if (password.equals ("covid")) {
				System.out.println("Access Granted!");
				System.out.println("You may proceed!");
				
				System.out.println("Do you want to search for users? ");
				System.out.println("y > yes ");
				System.out.println("n > no ");
				letter = reader.readLine().charAt(0);
				
				switch (letter) {
				case 'y': 
					System.out.println("What do you want to search for? ");
					System.out.println("p > phone number ");
					System.out.println("d > date time ");
					System.out.println("f > first name ");
					System.out.println("m > middle name ");
					System.out.println("l > last name ");
					letter = reader.readLine().charAt(0);
					
					
					switch (letter) {
					
					case 'p':
				    System.out.println("What is the phone number? ");	
					UserProfile.searchNumber(reader.readLine());
				  break;
				  
					case 'd':
					    System.out.println("What is the date and time? ");	
					    UserProfile.searchDateandTime(reader.readLine());
					    
					break;

						
					case 'f':
					    System.out.println("What is the first name? ");	
						UserProfile.searchFirstName(reader.readLine());
					break;	
					case 'm':
					    System.out.println("What is the middle name? ");	
						UserProfile.searchMiddleName(reader.readLine());
					break;
						
					case 'l':
					    System.out.println("What is the last name? ");	
						UserProfile.searchLastName(reader.readLine());	
					break;
					}
					
					
					
					
				break; 
				
				case 'n':  
					System.out.println("Have a good day! "); 	
				break;	
			}
			
			}
			else { 
				System.out.println(" Access failed!");
				System.out.println(" You are not the administrator.");
			}
		
		
		
				
			
		
		
	}


	} while (letter != 'q');
	 System.out.println  ("Thanks for stopping by! ");
	}
	
}
