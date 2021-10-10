package com.abstractassnmt;

abstract class A
{
	abstract void  display();
}
class B extends A
{
	void display() 
	{
		System.out.println("Called from B");
	}
}
public class AbstractAB 
{
	public static void main(String args[]) 
	{
		B b = new B();
		b.display();
		
	}
}