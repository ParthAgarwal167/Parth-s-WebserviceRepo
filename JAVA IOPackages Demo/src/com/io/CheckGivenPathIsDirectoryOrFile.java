package com.io;

import java.io.File;

public class CheckGivenPathIsDirectoryOrFile
{
	public static void main(String args[])
	{	
		File file = new File("D://IOstreams");
	    if(file.isDirectory())
	    	System.out.println("The given path is directory");
	    else if(file.isFile())
	    	System.out.println("The given path is file");
	    else
	    	System.out.println("The given path doesn't exist.");
	}
}