package com.bank.customer;

import org.apache.log4j.Logger;

import com.bank.LoginPage.LoginPage;
import com.bank.LoginPage.MainMenu;

public class CustomerDetails extends LoginPage {
	private String firstName;
	private String lastName;
	private String emailId;
	private long mobileNumber;
	private long accountNumber;
	// private String panNumber;
	// private Address permanentAddress;
	//private static Logger log=Logger.getLogger(CustomerDetails.class);

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
