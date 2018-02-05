package com.capgemini.contacts.dao;

import java.util.ArrayList;
import java.util.Iterator;

import com.capgemini.contacts.bean.ContactDetails;
import com.capgemini.contacts.exception.ContactIdNotExist;
import com.capgemini.contacts.exception.DuplicateNameException;

public class ClientDao {
	static ArrayList al = new ArrayList();
	public void addToList (ContactDetails details)throws DuplicateNameException{
		boolean flag= false;
		Iterator it = al.iterator();
		while(it.hasNext()){
			ContactDetails cd=(ContactDetails) it.next();
			if(cd.getcName().equals(details.getcName())){
				flag=true;
				throw new DuplicateNameException();
			}
		}
		if(flag==false){
			
			try {
				al.add(details);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Failed to add the contact");
			}
			System.out.println("Contact Added");
			System.out.println("Contact ID is: " + details.getContactID() );
		}
	
	}
	
	
	
	public void removeFromList(int contactID) throws ContactIdNotExist{
		Iterator it = al.iterator();
		boolean flag=false;
		int i=0;
		while(it.hasNext()){
			ContactDetails cd=(ContactDetails) it.next();
			if(cd.getContactID()==contactID){
				al.remove(cd);
				flag=true;
				System.out.println("Contact deleted successfully");
				break;
			}
			i++;
		}
		if(!flag){
			throw new ContactIdNotExist();
		}
		
	}
}
