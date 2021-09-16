package com.arraylist;
import java.util.TreeSet;
import java.util.NavigableSet;
import java.util.Iterator;

public class TreeSetClassUsingNavigableSet
{
	public static void main(String args[])
	{
		NavigableSet<String> trees = new TreeSet<String>();
		trees.add("Pine");
		trees.add("Cedar");
		trees.add("Peepal");
		trees.add("Banyan");
		trees.add("Red Wood");
		trees.add("Mahogany");

		System.out.println("Creation Service"); //creating new treeset
		System.out.println("Trees Set: " + trees);
		
		System.out.println("\nIteration Service"); //iterate through all elements
		Iterator itr = trees.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\nMerging Service"); //add all elements of a treeset to another treeset
		TreeSet<String> newtrees = new TreeSet<String>();
		newtrees.add("Black Ash");
		newtrees.add("Neem");
		newtrees.add("Common Fig");
		
		newtrees.addAll(trees);
		System.out.println("New Trees Set: " + newtrees);
		
		System.out.println("\nReversing Service"); //reverse all elements in treeset
		System.out.println("Before reversing, the trees set is: " + trees);
		NavigableSet<String> reverseset = trees.descendingSet();
		System.out.println("After reversing, the trees set is: " + reverseset);
		
		System.out.println("\nFetching Service"); //get first and last elements
		System.out.println("The first tree in this set is: " + newtrees.first());
		System.out.println("The last tree in this set is: " + newtrees.last());
		
		System.out.println("\nCloning Service"); //clone a treeset to another treeset
		System.out.println("Before cloning, the trees set is: " + newtrees);
		TreeSet<String> clonetreeset = new TreeSet<String>();
		clonetreeset = (TreeSet) newtrees.clone();
		System.out.println("After cloning, the tree set is: " + clonetreeset);
		
		System.out.println("\nGet Max Service"); //get no. of elements
		System.out.println("Total number of elements in trees set is: " + newtrees.size());
		
		System.out.println("\nComparing Service"); //compare two treesets
		System.out.println("First trees set: " + trees);
		System.out.println("Second trees set: " + newtrees);
		System.out.println("Comparing two tree sets: " + newtrees.equals(trees));
		
		System.out.println("\nNumbers Less Than 7"); //find nos. less than 7 in a treeset
		TreeSet<Integer> numtreeset = new TreeSet<Integer>();
		numtreeset.add(19);
		numtreeset.add(7);
		numtreeset.add(5);
		numtreeset.add(9);
		numtreeset.add(0);
		numtreeset.add(4);

		TreeSet num = (TreeSet) numtreeset.headSet(7);
		Iterator itr1 = num.iterator();
		System.out.println("Numbers less than 7 are: ");
		while (itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}
}
