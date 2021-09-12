package com.methodfn;

public class Student
{
	String stdname = null;
	int stdrollno = 0;
	void assignJdetails(String jname, int jrollno)
	{
		this.stdname = jname;
		this.stdrollno = jrollno;
		int jphoneno = 336227896;
		String jaddress = "New York";
		System.out.println("John" + "\nRoll number: " + stdrollno + "\nPhone Number: " + jphoneno + "\nAddress: " + jaddress);
	}
	void assignSdetails(String sname, int srollno)
	{
		this.stdname = sname;
		this.stdrollno = srollno;
		int sphoneno = 256748357;
		String saddress = "California";
		System.out.println("Sam" + "\nRoll number: " + stdrollno + "\nPhone Number: " + sphoneno + "\nAddress: " + saddress);
	}
	public static void main(String args[])
	{
		Student johnstd = new Student();
		Student samstd = new Student();
		johnstd.assignJdetails("John", 2);
		samstd.assignSdetails("Sam", 7);
	}
}
