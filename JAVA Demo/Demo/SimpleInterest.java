package com.demo;

public class SimpleInterest
{
	public static void main(String[] args)
	{
		float principal = (float) 2000, rate = (float) 8, time = (float) 3;
		float SI = (principal * rate * time) / (float) 100;
		System.out.println("Simple Interest: " + SI);
	}
}
