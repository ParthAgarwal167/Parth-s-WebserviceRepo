package com.assessment;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class StudentMarks
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int count = 0, temp = 0, sum = 0, high;
		System.out.println("Enter the number of students: ");
		int num = sc.nextInt();
		ArrayList<Integer> stdmarks = new ArrayList<Integer>();
		while (count < num)
		{
			System.out.println("Enter marks for student " + (count+1));
			int marks = sc.nextInt();
			count++;
			stdmarks.add(marks);
		}
		System.out.println("\nHighest marks: " + Collections.max(stdmarks));
		while (temp < num)
		{
			sum += stdmarks.get(temp);
			temp++;
		}
		float avg = (float) sum/num;
		System.out.println("Average marks: " + avg);
		for (int i=0; i<num; i++)
		{
			System.out.println((i+1) + " - " + stdmarks.get(i));
		}
		System.out.println("Whose marks do you wish to see? ");
		int pointer = sc.nextInt();
		System.out.println("Marks of student " + (pointer+1) + " is: " + stdmarks.get(pointer));
		System.out.println("Before sorting: " + stdmarks);
		Collections.sort(stdmarks);
		System.out.println("After sorting: ");
		Iterator itr = stdmarks.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
