package com.io;

import java.io.File;

/*
 * The list() method is a part of File class.The function returns an array of string denoting the 
 * files in a given abstract pathname if the path name is a directory else returns null.
 */
public class FileList
{
	public static void main(String args[])
	{	
		File file = new File("D:\\JAVA\\Core JAVA Training docs");
		String filelist[] = file.list();
		for(String list : filelist)
		{
			System.out.println(list);
		}
	}
}