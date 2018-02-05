package com.capgemini.contacts.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.contacts.bean.ContactDetails;
import com.capgemini.contacts.service.ContactsHelper;

public class ContactsHelperTestCase {
	ContactsHelper ch = new ContactsHelper();
	@Test(timeout=10)
	public void testAddContactDetails() {
		ch.addContactDetails(new ContactDetails(2,"Raj Singh","8288866678","8234343434","Arun16@gmail.com","FRIENDS"));
	}

	@Test(timeout=10)
	public void testDeleteContactDetails() {
		ch.deleteContactDetails(1);
	}
	

}
