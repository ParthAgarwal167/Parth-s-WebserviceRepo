package com.arraylist;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;

public class ArrayListClass
{
	public static void main(String args[])
	{
		int flag = 0;
        List<String> countries = new ArrayList<String>();
		countries.add("USA");
		countries.add("Africa");
		countries.add("Armenia");
		countries.add("Venezuela");
		
		System.out.println(countries);
		
		System.out.println("\nAddition Service");
		System.out.println("New country: "); //add an element at first position
		Scanner sc = new Scanner(System.in);
		String newelement = sc.next();
		countries.add(0, newelement);
		System.out.println(countries);
		
		System.out.println("\nRetriveal Service");
		System.out.println("Enter the index you want to retrieve: "); //retrieve an element at a specific index
		int index = sc.nextInt();
		System.out.println("Country at index " + index + " is: " + countries.get(index));
		
		System.out.println("\nUpdation Service");
		System.out.println("Before updation: "); //updating an element with another element
		Iterator itr = countries.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\nEnter the new country: ");
		String updateelement = sc.next();
		countries.set(2, updateelement);
		System.out.println("\nAfter updation: ");
		Iterator itr1 = countries.iterator();
		while (itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("\nSearching Service");
		System.out.println("Enter the country you want to search: "); //searching the element
		String searchelement = sc.next();
		Iterator itr2 = countries.iterator();
		while (itr2.hasNext())
		{
			if (itr2.next().equals(searchelement))
				flag++;
		}
		if (flag != 0)
			System.out.println(searchelement + " country found!");
		else
			System.out.println("Specified country not found!");
		
		System.out.println("\nSorting Service");
		System.out.println("Before sorting: " + countries); //sorting of arraylist
		Collections.sort(countries);
		System.out.println("After sorting: " + countries);
		
		System.out.println("\nRemoval Service");
		System.out.println("Countries list before removal: " + countries); //remove third element
		System.out.println("Enter third country to be removed: ");
		String removeelement = sc.next();
		countries.remove(new String (removeelement));
		System.out.println("After removal, countries list: " + countries);
		
		System.out.println("\nReversing Service");
		System.out.println("Countries list before reversing: "); //reverse the arraylist
		Iterator itr3 = countries.iterator();
		while (itr3.hasNext())
		{
			System.out.println(itr3.next());
		}
		String str;
		int size, max = countries.size();
		if (countries.size()%2 == 0)
			size = countries.size()/2 - 1;
		else
			size = countries.size()/2;
		for (int i = 0; i <= size; i++)
		{
			str = countries.get(i);
			countries.set(i, countries.get(max - 1 - i));
			countries.set(max - 1 - i, str);
		}
		System.out.println("Countries list after reversing: ");
		Iterator itr4 = countries.iterator();
		while (itr4.hasNext())
		{
			System.out.println(itr4.next());
		}
	}
}