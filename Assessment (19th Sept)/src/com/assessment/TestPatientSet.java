package com.assessment;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class Patient1
{
	private int patientId;
	private String name;
	private int age;
	
	//Parameterized constructor
	public Patient1(int patientId,String name,int age)
	{
		this.patientId=patientId;
		this.name=name;
		this.age=age;
	}

	//Getters / Setters
	public int getPatientId()
	{
		return patientId;
	}

	public void setPatientId(int patientId)
	{
		this.patientId = patientId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
}

public class TestPatientSet
{
	public static void main(String args[])
	{	
		Set<Patient1> patientset = new LinkedHashSet<Patient1>();
		patientset.add(new Patient1(1, "Rakesh", 19));
		patientset.add(new Patient1(2, "Amrita", 22));
		patientset.add(new Patient1(2, "Amrita", 22));		
		
		System.out.println("Size of set is: " + patientset.size());
		
		for(Patient1 patient : patientset)
		{
			System.out.println("Id: " + patient.getPatientId() + " Patient Name: " + patient.getName() + " Patient age: " + patient.getAge());
		}
	}
}