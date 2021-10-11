package com.io;

import java.io.File;

public class CheckFilePermissions
{	
	public static void main(String args[])
	{	
		File file = new File("D:\\JAVA\\Core JAVA Training docs");
		
		//checking permission
		if(file.canRead())
			System.out.println("File or Directory has read permission");
		else
			System.out.println("File or Directory has not read permission");
		if(file.canWrite())
			System.out.println("File or Directory has written permission");
		else
			System.out.println("File or Directory hasn't written permission");
	}
}