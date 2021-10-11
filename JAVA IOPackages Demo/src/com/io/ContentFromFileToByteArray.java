package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ContentFromFileToByteArray
{	
	public static void main(String args[]) throws IOException
	{
		File file = new File("D://IOstreams/abc.txt");
		InputStream fileiStream = new FileInputStream(file);
		//FileOutputStream write = new FileOutputStream(null)
		try
		{
			byte array[] = new byte[(int)file.length()];
			fileiStream.read(array);
			for(int i = 0; i < array.length; i++)
			{
				System.out.print((char)array[i]);
			}
		}
		catch(Exception e)
		{
			
		}
	}
}