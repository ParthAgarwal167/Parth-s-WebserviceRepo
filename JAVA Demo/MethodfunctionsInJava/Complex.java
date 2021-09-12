package com.methodfn;
import java.io.*;
import java.util.Scanner;

public class Complex 
{
	int real1, imaginary1, real2, imaginary2;
	Complex(int R1, int I1, int R2, int I2)
	{
		real1 = R1;
		imaginary1 = I1;
		real2 = R2;
		imaginary2 = I2;
	}
	void sumcomplex()
	{
		int sumreal = real1+real2;
		int sumimag = imaginary1+imaginary2;
		System.out.println("Sum of two complex nos: " + sumreal + "+" + sumimag + "i");
	}
	void diffcomplex()
	{
		int diffreal = real1-real2;
		int diffimag = imaginary1-imaginary2;
		System.out.println("Difference of two complex nos: " + diffreal + "+" + diffimag + "i");
	}
	void prodcomplex()
	{
		int prodreal = (real1*real2) - (imaginary1*imaginary2);
		int prodimag = (real1*imaginary2) + (imaginary1*real2);
		System.out.println("Product of two complex nos: " + prodreal + "+" + prodimag + "i");
	}
	public static void main(String args[])
	{
		int realno1, imaginaryno1, realno2, imaginaryno2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first complex number: ");
		realno1 = sc.nextInt();
		imaginaryno1 = sc.nextInt();
		System.out.println("Enter second complex number: ");
		realno2 = sc.nextInt();
		imaginaryno2 = sc.nextInt();
		Complex complex = new Complex(realno1, imaginaryno1, realno2, imaginaryno2);
		complex.sumcomplex();
		complex.diffcomplex();
		complex.prodcomplex();
	}
}
