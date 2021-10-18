package com.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class MergeArrayList 
{
	public static void main(String args[])
	{
		ArrayList<String> arrlist1 = new ArrayList<String>();
		ArrayList<String> arrlist2 = new ArrayList<String>();
		
		arrlist1.add("Tom");
		arrlist1.add("Sharon");
		arrlist1.add("John");
		
		arrlist2.add("Jackson");
		arrlist2.add("Max");
		arrlist2.add("Sam");
		arrlist2.add("Nikki");
		
		arrlist2.addAll(arrlist1);
		Iterator itr = arrlist2.iterator();
		
		System.out.println("New Names List: ");
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
