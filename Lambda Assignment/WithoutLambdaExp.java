package com.java8.lambdaexp;
import java.util.Scanner;

interface Square
{
	void draw();
}

public class WithoutLambdaExp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of square to draw: ");
		int side = sc.nextInt();
		
		Square sq = new Square()
		{
			@Override
			public void draw()
			{
				// TODO Auto-generated method stub
				System.out.println("Drawing the square: " + side);
			}			
		};
		sq.draw();
	}
}
