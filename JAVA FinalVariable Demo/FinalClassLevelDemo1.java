package com.finalvar;

//immutable class
//final class XYZ{  
//}  

class XYZ1
{
	
}  

public class FinalClassLevelDemo1 extends XYZ1
{
	void demo()
	{
		System.out.println("My Method");
    }  
    public static void main(String args[])
    {
    	FinalClassLevelDemo1 obj= new FinalClassLevelDemo1(); 
        obj.demo();
    }  
}