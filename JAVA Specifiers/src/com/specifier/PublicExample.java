package com.specifier;

class Area
{
	public double radius=6;
	void getArea()
	{
		System.out.println("Area: " + (Math.PI * radius * radius));
	}
}
public class PublicExample
{
	public static void main(String args[])
	{
		Area area = new Area();
		System.out.println("Radius: " + area.radius);
		area.getArea();
	}
}