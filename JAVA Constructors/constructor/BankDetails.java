package com.constructor;

public class BankDetails
{
	public BankDetails() //default constructor
	{
		int accountNum = 0;
		String name = null;
		int amount = 0;
		System.out.println("Account Number: " + accountNum + "\nAccount Holder: " + name + "\nAmount: " + amount);
	}
	public BankDetails(int newaccNum, String newName) //parameterized constructor
	{
		System.out.println("New Account Number: " + newaccNum + "\nNew Account Holder: " + newName);
	}
	public BankDetails(int newAmt, String acctype, String bankName) //constructor overloading
	{
		System.out.println("New Amount: " + newAmt + "\nType of Account: " + acctype + "\nBank Name: " + bankName);
	}
	public static void main(String args[])
	{
		BankDetails bankobj = new BankDetails();
		BankDetails bankobj1 = new BankDetails(334455, "John");
		BankDetails bankobj2 = new BankDetails(35000, "Savings Account", "SBI Bank");		
	}
}
