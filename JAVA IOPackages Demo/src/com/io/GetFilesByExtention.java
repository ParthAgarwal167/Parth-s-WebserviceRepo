package com.io;

import java.io.File;
import java.io.FilenameFilter;

public class GetFilesByExtention
{	
	public static void main(String args[])
	{	
		File file = new File("D:\\JAVA\\Core JAVA Training docs");
		String[] list = file.list(new FilenameFilter()
		{	
			@Override
			public boolean accept(File dir, String name)
			{
				// TODO Auto-generated method stub
				if(name.toLowerCase().endsWith(".png"))
					return true;
				else
					return false;
			}
		};

		//Printing the file having extension .png
		System.out.println("List of all file having extension '.png' ");
		for(int i = 0; i < list.length; i++)
		{
			System.out.println(list[i]);
		}
	}
}