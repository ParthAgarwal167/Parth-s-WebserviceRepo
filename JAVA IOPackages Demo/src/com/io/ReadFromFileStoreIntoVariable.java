package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileStoreIntoVariable
{
	public static void main(String args[]) throws IOException
	{
		String storevalue = new String();
		BufferedReader br = new BufferedReader(new FileReader("D://IOstreams/abc.txt"));
		try
		{	
			String string = br.readLine();
			while(string != null)
			{	
				storevalue += string;
				string = br.readLine();
			}
			System.out.println(storevalue);
		}
		finally
		{
			br.close();
		}
	}
}