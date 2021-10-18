package com.java8.lambdaexp;
import java.util.Scanner;

public class WithLambdaExp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of square to draw: ");
		int side = sc.nextInt();
		
		Square sq = () ->
		{
			System.out.println("Drawing the square: " + side);
		};
		sq.draw();
	}
}
