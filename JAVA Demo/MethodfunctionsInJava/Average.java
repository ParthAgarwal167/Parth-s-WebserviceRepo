package com.methodfn;
import java.io.*;
import java.util.Scanner;

public class Average 
{
	void avgfunction(int num1, int num2, int num3)
	{
		int avg = num1+num2+num3;
		System.out.println("Average of three numbers: " + avg);
	}
	public static void main(String args[])
	{
		int number1, number2, number3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
		Average avgofthreenos = new Average();
		avgofthreenos.avgfunction(number1, number2, number3);
	}
}
