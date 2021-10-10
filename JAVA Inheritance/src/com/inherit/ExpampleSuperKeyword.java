package com.inherit;

class Add
{
	int num1, num2;
	void setValueA(int n1, int n2)
	{
		num1 = n1;
		num2 = n2;
	}
	void result()
	{
		System.out.println("Sum is: " + (num1 + num2));
	}
}

class Subtract extends Add
{
	int num1, num2;
	void setValueB(int n1, int n2)
	{
		num1 = n1;
		num2 = n2;
	}
	void result()
	{
		super.result(); // we can call parent class method
		System.out.println("Subtraction is: " + (num1 - num2));
	}
}

public class ExpampleSuperKeyword
{
	public static void main(String args[]) 
	{
		Subtract subtract = new Subtract();
		subtract.setValueA(10, 70);
		subtract.setValueB(80,5);
		subtract.result();		
	}
}