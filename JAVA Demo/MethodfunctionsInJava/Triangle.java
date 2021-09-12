package com.methodfn;

public class Triangle
{
	int side1, side2, side3;
	Triangle()
	{
		side1=3;
		side2=4;
		side3=5;
		float temp = (side1 + side2 + side3)/2;
		float triArea = (float) Math.sqrt(temp*(temp - side1)*(temp - side2)*(temp - side3));
		System.out.println("Area of Triangle without parameters: " + triArea);
		int triPerimeter = side1 + side2 + side3;
		System.out.println("Perimeter of Triangle without parameters: " + triPerimeter);
	}
	Triangle(int side4, int side5, int side6)
	{
		float tempp = (side4 + side5 + side6)/2;
		float triArea1 = (float) Math.sqrt(tempp*(tempp - side4)*(tempp - side5)*(tempp - side6));
		System.out.println("Area of Triangle with parameters: " + triArea1);
		int triPerimeter1 = side4 + side5 + side6;
		System.out.println("Perimeter of Triagnle with parameters: " + triPerimeter1);
	}
	public static void main(String args[])
	{
		Triangle TriWithoutPara = new Triangle();
		Triangle TriWithPara = new Triangle(6, 7, 8);
	}
}
