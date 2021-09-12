package com.methodfn;
import java.util.Scanner;
public class AreaConstructor
{
	int length, breadth;
	AreaConstructor(int length1, int breadth1)
	{
		length = length1;
		breadth = breadth1;
	}
	int showArea()
	{
		return length*breadth;
	}
	public static void main(String args[])
	{
		int rectlength, rectbreadth;
		Scanner sc = new Scanner(System.in);
		System.out.println("Length: ");
		rectlength = sc.nextInt();
		System.out.println("Breadth: ");
		rectbreadth = sc.nextInt();
		AreaConstructor area = new AreaConstructor(rectlength, rectbreadth);
		System.out.println("Final Area: " + area.showArea());
		
	}
}
