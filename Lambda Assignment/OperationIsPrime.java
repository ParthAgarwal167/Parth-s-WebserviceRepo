package com.java8.lambdaexp;
import java.util.Scanner;

interface CheckPrimeComposite
{
	String isPrime(int num);
}

public class OperationIsPrime 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		CheckPrimeComposite checkobj = (num) ->
		{
			int count = 0;
			for (int i=1; i <= num; i++)
			{
				if (num%i == 0)
					count++;
				if (count > 2)
					break;
			}
			if (count == 2)
				return "Prime!";
			else
				return "Composite...";
		};
		System.out.println(checkobj.isPrime(number));
	}
}
