package com.arraylist;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;

public class HashSetClass
{
	public static void main(String args[])
	{
		HashSet<String> colours = new HashSet<String>();
		colours.add("Red");
		colours.add("Blue");
		colours.add("Yellow");
		colours.add("Purple");
		colours.add("Green");

		System.out.println("Appending Service"); //append at the end of hashset
		System.out.println("The colours set: " + colours);
		
		System.out.println("\nIterating Service"); //iterate through hashset
		Iterator itr = colours.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\nNumber of elements in HashSet"); //get number of elements in hashset
		System.out.println("Total number of elements in colours set: " + colours.size());
				
		System.out.println("\nCloning Service"); //clone one hashset to another
		System.out.println("Original colours set: " + colours);
		HashSet<String> cloneset = new HashSet<String>();
		cloneset = (HashSet<String>)colours.clone();
		System.out.println("Cloned colour set: " + cloneset);
		
		System.out.println("\nConverting Service into Array"); //convert hashset into array
		System.out.println("Colours set: " + colours);
		Object array[] = colours.toArray();
		System.out.println("Array elements of colours are: ");
		for (int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("\nConverting Service into TreeSet"); //convert hashset into treeset
		System.out.println("Colours set: " + colours);
		TreeSet<String> colourstreeset = new TreeSet<String>(colours);
		System.out.println("Tree Set of colours: " + colourstreeset);
		
		System.out.println("\nConverting Service into ArrayList"); //convert hashset into array
		System.out.println("Colours set: " + colours);
		List<String> colourslist = new ArrayList<String>(colours);
		System.out.println("Converted to colours list: " + colourslist);
		
		System.out.println("\nClear Service"); //empty hashset
		colours.removeAll(colours);
		System.out.println("The colours set has been emptied -> " + colours);
		
		System.out.println("\nTesting Service"); //test hashset is empty or not
		System.out.println("Is the colours set empty?");
		if (colours.isEmpty() == true)
			System.out.println("Yes, the colours set is empty.");
		else
			System.out.println("No, the colours set is not empty.");
	}
}
