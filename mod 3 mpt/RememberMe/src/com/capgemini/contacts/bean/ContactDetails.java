package com.capgemini.contacts.bean;

public class ContactDetails {
	private int contactID;
	private String cName;
	private String mobileNo1;
	private String mobileNo2;
	private String emailID;
	private String groupName;
	public int getContactID() {
		return contactID;
	}
	public void setContactID(int contactID) {
		this.contactID = contactID;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getMobileNo1() {
		return mobileNo1;
	}
	public void setMobileNo1(String mobileNo1) {
		this.mobileNo1 = mobileNo1;
	}
	public String getMobileNo2() {
		return mobileNo2;
	}
	public void setMobileNo2(String mobileNo2) {
		this.mobileNo2 = mobileNo2;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public ContactDetails(int contactID, String cName, String mobileNo1,
			String mobileNo2, String emailID, String groupName) {
		super();
		this.contactID = contactID;
		this.cName = cName;
		this.mobileNo1 = mobileNo1;
		this.mobileNo2 = mobileNo2;
		this.emailID = emailID;
		this.groupName = groupName;
	}
	public ContactDetails() {
		// TODO Auto-generated constructor stub
	} 
	
}
