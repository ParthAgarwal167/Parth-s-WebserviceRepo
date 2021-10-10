package com.arraylist;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListClass 
{
	public static void main(String args[])
	{
		List<String> currency = new LinkedList<String>();
		currency.add("Dollar");
		currency.add("Rupee");
		currency.add("Yuan");
		currency.add("Pound");
		currency.add("Riyal");

		System.out.println("Appending Service");
		System.out.println("Currency list is: " + currency); //append at the end of element
		
		System.out.println("\nIteration Service"); //iterate through all elements
		Iterator itr = currency.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\nIterating Service at specified position"); //iterate at specified position
		System.out.println("Enter the index: ");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		Iterator itr1 = currency.listIterator(index); //iterate from 3rd position
		while (itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("\nIterating Service in reverse order"); //iterate through elements in reverse order
		System.out.println("Before reversing, the currency list is: " + currency);
		System.out.println("Now iterating through it in reverse order: ");
		for (int i = currency.size()-1; i >= 0; i--)
		{
			System.out.println(currency.get(i));
		}
		
		System.out.println("\nInsetion Service");
		System.out.println("Before insertion, the currency list: " + currency);
		System.out.println("Enter the index: "); //insert specific element at specified position
		int pos = sc.nextInt();
		System.out.println("Enter the new currency: ");
		String newcurr = sc.next();
		currency.add(pos, newcurr);
		System.out.println("After insertion, the new currency list: " + currency);
		
		System.out.println("\nInsertion Service at first and last positions");
		System.out.println("Before insertion, the currency list is: " + currency); //insert at first and last
		System.out.println("Enter the new currency at first position: ");
		String curr1 = sc.next();
		currency.add(0, curr1);
		System.out.println("Enter the new currency at last position: ");
		String curr2 = sc.next();
		currency.add(currency.size()-1, curr2);
		System.out.println("After insertion, the new currency list is: " + currency);
	}
}
