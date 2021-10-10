package com.constoverloading;

public class ConsOverloadingByChangeSeq
{
	//for employee 
	ConsOverloadingByChangeSeq(int empid, String empname, int emprating)
	{
		System.out.println("Name: " + empname + "\nEmployee Id: " + empid + "\nEmployee Rating: " + emprating + "\n");
	}
	
	//After changing the sequence of empname and empid
	ConsOverloadingByChangeSeq(String empname, int empid, int emprating)
	{
		System.out.println("Name: " + empname + "\nEmployee Id: " + empid + "\nEmployee Rating: " + emprating + "\n");
	}
	
	//Main method
	public static void main(String args[])
	{
		ConsOverloadingByChangeSeq const1 = new ConsOverloadingByChangeSeq(101, "Anurag", 4);
		ConsOverloadingByChangeSeq const2 = new ConsOverloadingByChangeSeq("Amit", 102, 4);
	}
}