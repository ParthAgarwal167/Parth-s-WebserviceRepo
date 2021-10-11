package com.io;

import java.io.File;

public class CheckFileOrDirectory
{	
	public static void main(String args[])
	{
		File file = new File("D://IOstreams/abc.txt");
		
		//Checking file or directory exist or not
		if(file.exists())
		{	
			if(file.exists() && file.isFile())
				System.out.println("File exists");
			else if(file.exists() && file.isDirectory())
				System.out.println("Directory exists");			
		}
		else
			System.out.println("File or dirctory doesn't exist.");		
	}
}