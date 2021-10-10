package com.inherit;

class Add1
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

class Subtract1 extends Add1
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
class Multiply1 extends Subtract1
{
	int num1, num2;
	void setValueC(int n1, int n2)
	{
		num1 = n1;
		num2 = n2;
	}
	void result() 
	{
		super.result(); // we can call parent class method
		System.out.println("Multiplication is: " + (num1 * num2));
	}
}
public class MultiLevelInheritrence 
{
	public static void main(String args[]) 
	{
		Multiply1 multiply1 = new Multiply1();
		multiply1.setValueA(10, 70);
		multiply1.setValueB(80,5);
		multiply1.setValueC(8, 9);
		multiply1.result();
	}
}