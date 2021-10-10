package com.specifier;

class AreaCircle
{
	private double radius=5;
	//I have created getter and setter method for accessing the private variable
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	void getArea()
	{
		System.out.println("Area of circle: " + (Math.PI * radius * radius));
	}
}

public class PrivateExample
{
	public static void main(String args[])
	{
		AreaCircle ac = new AreaCircle();
		//System.out.println("Radius: " + ac.radius); // here we can can not access private variable
		System.out.println("Radius: " + ac.getRadius());
		ac.getArea();
	}
}