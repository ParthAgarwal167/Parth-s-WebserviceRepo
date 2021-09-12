package com.methodfn;

public class Rectangle1
{
	int length1 = 4, breadth1 = 5, length2 = 5, breadth2 = 8;
	int Area(int length, int breadth)
	{
		int area = length * breadth;
		return area;
	}
	public static void main(String args[])
	{
		Rectangle1 rect1 = new Rectangle1();
		System.out.println("Area of 1st Rectangle: " + rect1.Area(rect1.length1, rect1.breadth1));
		Rectangle1 rect2 = new Rectangle1();
		System.out.println("Area of 2nd Rectangle: " + rect2.Area(rect2.length2, rect2.breadth2));
	}
}
