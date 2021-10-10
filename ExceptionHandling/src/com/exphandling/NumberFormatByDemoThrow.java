package com.exphandling;

import java.util.Scanner;

public class NumberFormatByDemoThrow
{	
	static void checkInteger(String num)
	{	
		int i = Integer.parseInt(num); // here checking whether given input is integer or not
		System.out.println("The Square of number is: " + i * i);
	}
	public static void main(String args[])
	{	
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter an integer : ");
			String num = sc.next();
			checkInteger(num);	
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered input is not a valid format for an integer");
		}
	}
}