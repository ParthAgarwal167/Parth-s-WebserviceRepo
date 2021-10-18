package com.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("Tom");
		arrlist.add("Jerry");
		arrlist.add("John");
		arrlist.add("Sam");
		arrlist.add("Sharon");
		
		System.out.println("Names List: ");
		Iterator itrlist = arrlist.iterator();
		while (itrlist.hasNext())
		{
			System.out.println(itrlist.next());
		}
	}
}
