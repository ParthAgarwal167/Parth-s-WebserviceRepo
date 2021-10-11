package com.strings;

public class CountFrequencyofCharacter
{
	public static void main(String args[])
	{
		String string1 = "This book is good for studying java";
		//Loop
		int startIndex = 0;
		int count = 0;
		for(int i = 0; i < string1.length(); i++)
		{
			int index = string1.indexOf("i", startIndex);
			
			if(index >= 0)
			{
				count++;
				startIndex = index+1;
			}
		}
		System.out.println("Frequency of 'i' in given sentence is: " + count);		
	}
}