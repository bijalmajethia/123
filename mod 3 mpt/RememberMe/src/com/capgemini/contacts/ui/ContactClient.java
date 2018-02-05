package com.capgemini.contacts.ui;

import java.util.Scanner;

import com.capgemini.contacts.bean.ContactDetails;
import com.capgemini.contacts.service.ContactsHelper;
import com.capgemini.contacts.service.ContactsValidator;

public class ContactClient {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactClient client = new ContactClient();
		client.displayMenu();
	}
	public void displayMenu(){
		int choice;
		boolean validate=false;
		ContactsValidator service = new ContactsValidator(); 
		ContactDetails details = new ContactDetails();
		ContactsHelper helper = new ContactsHelper();
	
	
		while(true){
		System.out.println("Please enter your choice :");
		System.out.println("1. Add New Contact");
		System.out.println("2. Delete Contact");
		System.out.println("3. Exit");
		
		try {
			choice=Integer.parseInt(scan.nextLine());
		
		
		switch(choice){
		case 1:
			do{
				System.out.println("Enter Details:");
				details= takeUserInput();
				validate=service.validateDetails(details);
				if(!validate){
					System.out.println("Please Enter the correct Details");
				}
			}
			while(validate==false);
			helper.addContactDetails(details);
			
			break;
		case 2:
			System.out.println("Enter the contact ID: ");
			int contactID = Integer.parseInt(scan.nextLine());
			helper.deleteContactDetails(contactID);
			break;
		case 3:
			System.exit(0);
			
		default: 
			System.out.println("You have entered wrong choice");
		
		}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Please enter valid choice");
		}
		}
	}
	
	public static ContactDetails takeUserInput(){
		ContactDetails details = new ContactDetails();
	
		System.out.print("Enter Name : ");
		details.setcName(scan.nextLine());
		System.out.print("Enter Mobile No. : ");
		details.setMobileNo1(scan.nextLine());
		System.out.print("Do you want to add alternate Mobile No. ? ");
		
		char ch;
		ch = scan.nextLine().charAt(0);
		if(ch=='Y' || ch=='y')
		{
			System.out.print("Enter Mobile No. : ");
			details.setMobileNo2(scan.nextLine());
		}
		else{
			details.setMobileNo2(null);
		}
		System.out.print("Enter Email Id : ");
		details.setEmailID(scan.nextLine());
		
		System.out.print("Select the Group (Friends/Family/CoWorkers) : ");
		String group=scan.nextLine().toUpperCase();
		details.setGroupName(group);
		
		return details;
	}
}
