package com.capgemini.beans;
import java.util.HashSet;
import java.util.Set;

public class Student {
	private int rollNumber;
	private String name;
	private Set<String> courses;
	
	public Student() {
		super();
	}

	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		courses = new HashSet<String>();
	}
	
	public void addCourse(String name) {
		courses.add(name);
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return rollNumber + " " + name;
	}
}
