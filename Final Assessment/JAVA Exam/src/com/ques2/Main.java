package com.ques2;

public class Main
{
	public static void main(String[] args)
	{
		Guitar g1; //instance variable for Guitar Interface
		Piano p1; //instance variable for Piano Interface.
		g1 = new Instrument();
		p1 = new Instrument();
		System.out.print("Guitar");
		g1.play();
		System.out.print("Piano");
		p1.play();
	}
}