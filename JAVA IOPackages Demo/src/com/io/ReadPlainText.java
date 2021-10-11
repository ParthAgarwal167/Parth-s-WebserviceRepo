package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadPlainText
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream file = new FileInputStream("D://IOstreams/abc.txt");
		BufferedInputStream bufferedInputStream = new BufferedInputStream(file);
		int i;
		while((i = bufferedInputStream.read()) != -1)
		{
			System.out.print((char)i);
		}
		file.close();
		bufferedInputStream.close();
	}
}