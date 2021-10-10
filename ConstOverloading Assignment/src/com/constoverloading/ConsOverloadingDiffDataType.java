package com.constoverloading;

public class ConsOverloadingDiffDataType
{
	public ConsOverloadingDiffDataType() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("Hey!");
	}
    ConsOverloadingDiffDataType(int num1, int num2)
    {
		System.out.println("Sum of two integer numbers: " + (num1 + num2));
		//ConsOverloadingDiffDataType();
	}
	
    ConsOverloadingDiffDataType(float num1, float num2) 
    {
    	System.out.println("Sum of two floating point numbers: " + (num1 + num2));
	}
    
    public static void main(String args[])
    {
       	ConsOverloadingDiffDataType const1 = new ConsOverloadingDiffDataType(8, 3);
    	ConsOverloadingDiffDataType const2 = new ConsOverloadingDiffDataType((float)5.5, (float)8.9);
    }
}