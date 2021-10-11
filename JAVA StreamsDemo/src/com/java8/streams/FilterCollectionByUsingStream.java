package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product5
{
	int id;
	String name;
	float price;
	
	public Product5(int id, String name, float price)
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class FilterCollectionByUsingStream
{
	public static void main(String args[])
	{	
		List<Product5> productsList = new ArrayList<Product5>();
		
		//Adding products
		productsList.add(new Product5(2,"Dell Laptop",30000f));  
        productsList.add(new Product5(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product5(4,"Sony Laptop",28000f));  
        productsList.add(new Product5(5,"Apple Laptop",90000f)); 
        
        List<Float> productProiceList2 = productsList.stream()
        		.filter(p-> p.price>30000)
        		.map(p->p.price)
        		.collect(Collectors.toList());
        
        System.out.println(productProiceList2);
	}
}