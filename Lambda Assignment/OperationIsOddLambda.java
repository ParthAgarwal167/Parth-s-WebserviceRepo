package com.java8.lambdaexp;
import java.util.Scanner;

interface Checknumber
{
	String isOdd(int num);
}

public class OperationIsOddLambda
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		Checknumber oddeven = (num) ->
		{
			if (num%2 == 0)
				return "Even";
			else
				return "Odd";
		};
		System.out.println(oddeven.isOdd(number));
	}
}
