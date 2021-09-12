package com.methodfn;
import java.util.Scanner;
public class Area
{
	int length, breadth, area;
	void setDim(int length1, int breadth1)
	{
		length = length1;
        breadth = breadth1;
		area = length*breadth;
	}
	int getArea()
	{
		return area;
	}
	public static void main(String args[])
	{
		int rectlength, rectbreadth;
		Scanner sc = new Scanner(System.in);
		Area rectarea = new Area();
		System.out.println("Enter length of rectangle: ");
		rectlength = sc.nextInt();
		System.out.println("Enter breadth of rectangle: ");
		rectbreadth = sc.nextInt();
		rectarea.setDim(rectlength, rectbreadth);
		System.out.println("Area of Rectangle: " + rectarea.getArea());
	}
}
