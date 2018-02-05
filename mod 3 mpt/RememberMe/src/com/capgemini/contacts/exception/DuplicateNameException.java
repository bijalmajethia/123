package com.capgemini.contacts.exception;

public class DuplicateNameException extends Exception {
	public DuplicateNameException(){
		System.out.println("Duplicate Contact. Failed to add the Contact");
	}
}
