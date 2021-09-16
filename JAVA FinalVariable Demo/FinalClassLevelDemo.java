package com.finalvar;

class XYZ
{
	
}  

public class FinalClassLevelDemo extends XYZ
{
	void demo()
	{
		System.out.println("My Method");
    }  
    public static void main(String args[])
    {
    	FinalClassLevelDemo obj= new FinalClassLevelDemo(); 
        obj.demo();
    }  
}