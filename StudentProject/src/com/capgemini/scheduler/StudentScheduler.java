package com.capgemini.scheduler;
import java.util.Hashtable;

import com.capgemini.beans.Course;
import com.capgemini.beans.Student;

public class StudentScheduler {
	//private Student[] students = new Student[10];
	//private int counterStudent;
	private Hashtable<Integer, Student> studentTable = new Hashtable<Integer, Student>();
	private Hashtable<String, Course> courseTable = new Hashtable<String, Course>();
	
	public String addStudent(int rollNumber,String name)
	{
		if (studentTable.containsKey(rollNumber)) {
			return "roll number already in use";
		}
		//students[counterStudent++]=new Student(rollNumber,name, courses);
		studentTable.put(rollNumber, new Student(rollNumber,name));
		return "Student added successfully";
		
	}
	
	public String addCourse(String name) {
		if (courseTable.containsKey(name)) {
			return "course already exists";
		}
		courseTable.put(name, new Course(name));
		return "Course added successfully";
	}
	
	public Course getCourse(String name) {
		return courseTable.get(name);
	}
	
	public Student getStudent(int rollNumber) {
		return studentTable.get(rollNumber);
	}
	
	public void showAllStudents()
	{
		for (int key : studentTable.keySet()) {
			System.out.println(studentTable.get(key));
		}
	}
}
