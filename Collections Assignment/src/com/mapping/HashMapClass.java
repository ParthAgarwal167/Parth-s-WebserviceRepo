package com.mapping;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class HashMapClass
{
	public static void main(String args[])
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();    
	    map.put(100,"Amit");    
	    map.put(102,"Ravi");    
	    map.put(101,"Vijay");    
	    map.put(103,"Rahul");    
	    
	    System.out.println("Association Service"); //associate key to value in hashmap
        for(Map.Entry m : map.entrySet())
        {  
        	System.out.println(m.getKey() + " " + m.getValue());
        }
        
        System.out.println("\nCounting Service"); //count key-value pairs in hashmap
        System.out.println("Number of persons in hashmap: " + map.size());
        
        System.out.println("\nCopy Service"); //copy all elements of one hashmap to another
        Map<Integer,String> mapcopy = new HashMap<Integer,String>();
		mapcopy.putAll(map);
		System.out.println("List of persons : " + mapcopy);
		
		System.out.println("\nYest Key Mapping Service"); //test key in hashmap
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key: ");
		Integer key = sc.nextInt();
		if(map.containsKey(key))
			System.out.println("Yes mapping is available for key: " + key);
		else
			System.out.println("Mapping is not available for key: " + key);
		
		System.out.println("\nTest Value Mapping Service"); //test value in hashmap
		System.out.print("Enter the value: ");
		String value = sc.next();
		if(map.containsValue(value))
			System.out.println("Yes mapping is available for value: " + value);
		else
			System.out.println("Mapping is not available for value: " + value);
		
		System.out.println("\nSet View Service"); //set view of hashmap
		Set setlist = map.entrySet();
		System.out.println("Set key values are: " + setlist);
		
		System.out.println("\nRemoval Service"); //remove all mappings
		map.clear();
		System.out.println("The hashmap is cleared -> " + map);
		
		System.out.println("\nCheck Service"); //check whether hashmap is empty or not
		boolean check = map.isEmpty();
		if(check == true)
			System.out.println("Map is empty");
		else
			System.out.println("Map is not empty");
	}
}
