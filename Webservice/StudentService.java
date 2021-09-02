package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/
public class StudentService {
	static HashMap<Integer, Students> studentsIdMap = getStudentsIdMap(); //map list

	 public StudentService() {
	super();

	 if (studentsIdMap == null) {
	studentsIdMap = new HashMap<Integer, Students>();
	// Creating some objects of Person while initializing
	Students indiaPerson = new Students(1, "ram1","java", "ram@gmail.com");
	Students chinaPerson = new Students(2, "ram2","Sql", "ram@gmail.com");
	Students nepalPerson = new Students(3, "ram3", "Python","ram@gmail.com");
	Students bhutanPerson = new Students(4, "ram4", "Jquery","ram@gmail.com");

	 //adding map list of collections in java
	studentsIdMap.put(1, indiaPerson);
	studentsIdMap.put(4, chinaPerson);
	studentsIdMap.put(2, bhutanPerson);
	studentsIdMap.put(3, nepalPerson);
	}
	}

	public List<Students> getAllStudentslist() {
	List<Students> studentlist = new ArrayList<Students>(studentsIdMap.values());
	return studentlist;
	}

	 public Students getStudents(int id) {
	Students Students = studentsIdMap.get(id);
	return Students;
	}


	// add person
	public Students addStudents(Students students) {
	students.setId(getMaxId()+ 1);
	// key , value
	studentsIdMap.put(students.getId(), students); ///logic class
	return students;
	}
	//update
	public Students updateStudents(Students students) {
	if (students.getId() <= 0)
	return null;
	studentsIdMap.put(students.getId(), students);
	return students;

	 }
	//delete

	public void deleteStudents(int id) {
	studentsIdMap.remove(id);
	}
	public static HashMap<Integer, Students> getStudentsIdMap() {
	return studentsIdMap;
	}

//	 // Utility method to get max id
	public static int getMaxId() {
	int max = 0;
	for (int id : studentsIdMap.keySet()) {
	if (max <= id)
	max = id;

	 }
	return max;
	}	
}