package com.mapping;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Comparator;

public class TreeMapClass
{
	public static void main(String args[])
	{
		TreeMap<Integer,String> treemap = new TreeMap<Integer,String>();    
	    treemap.put(10, "Psiedon");
	    treemap.put(20, "Ares");   
	    treemap.put(30, "Zeus");   
	    treemap.put(40, "Athena");   
	    treemap.put(50, "Hades");   

	    System.out.println("Association Service"); //associate the key-value pairs
        for(Map.Entry m : treemap.entrySet())
        {  
        	System.out.println(m.getKey() + " " + m.getValue());
	    }
        
        System.out.println("\nCopying Service"); //copy contents of one treemap to another
        TreeMap<Integer,String> treemapcopy = new TreeMap<Integer,String>(); 
		treemapcopy.putAll(treemap);
		System.out.println(treemapcopy);
		
		System.out.println("\nSearching by key Service"); //search by key in treemap
		Scanner sc = new Scanner(System.in);
  		System.out.print("Enter the key: ");
  		Integer key = sc.nextInt();
  		if(treemap.containsKey(key))
  			System.out.println("Yes mapping is available for key: " + key);
  		else
  			System.out.println("Mapping is not available for key: " + key);
  		
  		System.out.println("\nSearching by value Service"); //search by value in treemap
		System.out.print("Enter the value: ");
		String value = sc.next();
		if(treemap.containsValue(value))
			System.out.println("Yes mapping is available for value: " + value);
		else
			System.out.println("Mapping is not available for value: " + value);
		
		System.out.println("\nGet keys Service"); //get all keys in treemap
		Iterator<Integer> itr = treemap.keySet().iterator();
	    System.out.println("All the Keys are: ");
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    System.out.println("\nSorting Service"); //sort the keys using comparator
	    TreeMap<String,String> sortmap = new TreeMap<String,String>(new sortreemap());    
		sortmap.put("4", "Birds");
		sortmap.put("5", "Amphibians");
		sortmap.put("1", "Mammals");
		sortmap.put("3", "Omnivorous");
		sortmap.put("2", "Carnivorous");
	    System.out.println("Sorted tree map: " + sortmap);
	    
	    System.out.println("\nKey-Value Mapping Service"); //get key-value mapping with greatest key and the least key in a treemap
	    System.out.println("Greatest Key: " + treemap.firstEntry());
	    System.out.println("Least key value:" + treemap.lastEntry());
	    
	    System.out.println("\nDeleting Service"); //delete all elements in treemap
	    treemap.clear();
	    System.out.println("Treemap is cleared-> " + treemap);
	}
}
class sortreemap implements Comparator<String>
{
	public int compare(String key, String value)
	{
		return key.compareTo(value);
	}
}