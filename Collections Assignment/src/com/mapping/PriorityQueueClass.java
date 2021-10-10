package com.mapping;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueClass
{
	public static void main(String args[])
	{
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Reg");
		pq.add("Yellow");
		pq.add("Blue");
		pq.add("SkyBlue");
		
		System.out.println("Creation and Printing Service"); //create priority queue of colors and print
		System.out.println("The colors are: " + pq);
		
		System.out.println("\nIteration Service"); //iterate through all elements
		Iterator itr = pq.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\nAppendation Service"); //add all elements of one pq to another
		PriorityQueue<String> newpq = new PriorityQueue<String>();
		newpq.add("Violet");
		newpq.add("Brown");
		newpq.add("Pink");
		System.out.println("The old priority queue: " + pq);
		newpq.addAll(pq);
		System.out.println("The new priority queue: " + newpq);
		
		System.out.println("\nInsertion Service"); //insert a given element into a priority queue
		Scanner sc = new Scanner(System.in);
		System.out.println("What color do you wish to insert?: ");
		String color = sc.next();
		pq.add(color);
		System.out.println("The colors after insertion are: " + pq);
		
		System.out.println("\nCounting Service"); //count all elements in priority queue
		System.out.println("The number of elements in priority queue is: " + pq.size());
		
		System.out.println("\nComparing Service"); //compare two priority queues
		PriorityQueue<String> cmpqueue = new PriorityQueue<String>();
		cmpqueue.add("Red");
		cmpqueue.add("Yellow");
		cmpqueue.add("Blue");
		cmpqueue.add("SkyBlue");
		cmpqueue.add("Purple");
		cmpqueue.add("White");
		cmpqueue.add("Magenta");
		System.out.println("Comparing two priority queues: " + newpq.containsAll(cmpqueue));
		//for case of single element compare
		System.out.println("Single element compare case: ");
		for (String element : newpq)
		{
			System.out.println(cmpqueue.contains(element));
		}
		
		System.out.println("\nRemoval Service"); //remove all elements from the priority queue
		pq.clear();
		System.out.println("The priority queue is cleared! -> " + pq);
		
	}
}
