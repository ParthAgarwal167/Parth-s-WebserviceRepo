package com.constructor;

public class Grader
{
	int score;
	Grader(int total_score)
	{
		this.score = total_score;
	}
	Grader(String student_name, String class_standard, String school_name)
	{
		System.out.println("Name of Student: " + student_name + "\nClass Standard: " + class_standard + "\nSchool Name: " + school_name);
	}
	public void letterGrader()
	{
		if (score > 90 && score <= 100)
			System.out.println("Grade: O");
		else if (score > 80 && score <= 90)
			System.out.println("Grade: A");
		else if (score > 70 && score <= 80)
			System.out.println("Grade: B");
		else if (score > 60 && score <= 70)
			System.out.println("Grade: C");
		else if (score > 50 && score <= 60)
			System.out.println("Grade: E");
		else
			System.out.println("Grade: F");
	}
}