package com.java8.lambdaexp;
import java.util.Scanner;

interface CheckPalindrome
{
	String isPalindrome(int num);
}

public class OperationIsPalindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		CheckPalindrome chckpal = (num) ->
		{
			int sum=0, temp = num;
			while (temp != 0)
			{
				sum = sum*10 + (temp%10);
				temp = temp/10;
			}
			return ((num == sum)? "It is Palindrome!" : "Not Palindrome...");
		};
		System.out.println(chckpal.isPalindrome(number));
	}
}
