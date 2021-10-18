package com.collections;
import java.util.Vector;

public class VectorDemo 
{
	public static void main(String args[])
	{
		Vector<String> vect = new Vector<String>();
		
		vect.add("Leopard");
		vect.add("Lion");
		vect.add("Tiger");
		vect.add("Wolf");
		vect.add("Hyena");
		vect.add("Bear");
		
		System.out.println("Carnivorous Animals: " + vect);
	}
}
