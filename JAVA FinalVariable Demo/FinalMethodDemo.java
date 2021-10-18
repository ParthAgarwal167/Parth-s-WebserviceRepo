package com.finalvar;

class XYZ
{
	/*
     * final void demo() { System.out.println("XYZ Class Method"); }
     * 
     */

    void demo()
    { 
    	System.out.println("XYZ Class Method"); 
    }
}

public class FinalMethodDemo extends XYZ 
{
	void demo() 
	{                                     //overriding going here
        System.out.println("ABC Class Method");
    }
    public static void main(String args[])
    {
        FinalMethodDemo obj = new FinalMethodDemo();
        obj.demo();
    }
}