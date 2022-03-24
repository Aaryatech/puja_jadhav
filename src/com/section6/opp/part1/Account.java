package com.section6.opp.part1;

public class Account {

	private String customerName;
	private String accountNumber;
	private double balance;
	private String mobileNumber;
	
	public void deposit(double depositAmount) {
		this.balance = balance + depositAmount;
		System.out.println("Deposit of "+depositAmount +"New Balance is "+this.balance);
	}
	public void withdrawl(double withdrawlAmount) {
		if(this.balance - withdrawlAmount <=0) {
			System.out.println("Available withdrwal not proceed ");
		}
		else {
			this.balance = this.balance - withdrawlAmount;
			System.out.println("Withdrwal of "+	withdrawlAmount +"Remaining Balance "+this.balance);
		}
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
}
