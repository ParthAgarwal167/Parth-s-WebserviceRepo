package com.strings;

/*
-> Java String class contains() method searches the sequence of characters in this string.
-> It returns true if the sequence of char values is found in this string otherwise 
  returns false.
->The contains() method searches case-sensitive char sequence. If the argument 
 is not case sensitive, it returns false. Let's see an example.     
* */

public class ContainsMethod
{
	public static void main(String args[])
	{
		//contains()method
		String s1 = "Hi all welcome to IT world";
		System.out.println(s1.contains("welcome to"));
		System.out.println(s1.contains("iT"));
		
	    boolean checker = s1.contains("Welcome to");
	    System.out.println(checker);
	    boolean checker1 = s1.contains("welcome to");
	    System.out.println(checker1);
	}
}