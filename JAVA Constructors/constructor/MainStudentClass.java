package com.constructor;
import java.util.Scanner;

public class MainStudentClass
{
	public static void main(String args[])
	{
		int student_marks;
		String stud_name, class_std, school_name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Your Name: ");
		stud_name = sc.next();
		System.out.println("Your Class Standard: ");
		class_std = sc.next();
		System.out.println("Your School Name: ");
		school_name = sc.next();
		do
		{
			System.out.println("Total Marks: ");
			student_marks = sc.nextInt();
			if (student_marks > 100 || student_marks < 0)
				System.out.println("Invalid marks! Try again!");
		} while (student_marks > 100 || student_marks < 0);
		Grader graderdetails = new Grader(stud_name, class_std, school_name);
		Grader graderscore = new Grader(student_marks);
		graderscore.letterGrader();
	}
}
