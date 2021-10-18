package com.collections;
 
// Java code to demonstrate
// adding of elements in
// NavigableSet
import java.util.*;
import java.io.*;
 
public class NavigableInterfaceDemo
{
	public static void main(String[] args)
    {
		NavigableSet<String> ts = new TreeSet<String>();
 
        // Elements are added using add() method
        ts.add("T");
        ts.add("B");
        ts.add("C");
        ts.add("Z");
        ts.add("Z");
        //ts.add(null); tree set does  not allow you null values
 
        System.out.println(ts);
    }
}