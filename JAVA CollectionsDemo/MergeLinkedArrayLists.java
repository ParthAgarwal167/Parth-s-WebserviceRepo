package com.collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class MergeLinkedArrayLists
{
	public static void main(String args[])
	{
		LinkedList<String> linkedlist = new LinkedList<String>();
		ArrayList<String> arrlist = new ArrayList<String>();
		
		linkedlist.add("Violin");
		linkedlist.add("Guitar");
		linkedlist.add("Flute");
		linkedlist.add("Cello");
		
		arrlist.add("Sitar");
		arrlist.add("Drums");
		arrlist.add("Casio");
		
		linkedlist.addAll(arrlist);
		Iterator itr = linkedlist.iterator();
		
		System.out.println("Musical Instruments List: ");
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
