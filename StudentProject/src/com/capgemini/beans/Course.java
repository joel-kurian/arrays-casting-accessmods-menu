package com.capgemini.beans;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Course {
	private String name;
	private Set<Integer> students;
	
	public Course(String name) {
		super();
		this.name = name;
		students = new HashSet<Integer>();
	}
	
	public void addStudent(int rollNumber) {
		students.add(rollNumber);
	}

	public String getName() {
		return name;
	}
	
	public Iterator<Integer> getStudents() {
		return students.iterator();
	}
}
