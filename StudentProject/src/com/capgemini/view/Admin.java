package com.capgemini.view;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.beans.Course;
import com.capgemini.scheduler.StudentScheduler;

public class Admin {
	private static Scanner sc=new Scanner(System.in);
	private static StudentScheduler studSch = new StudentScheduler();
	
	public static void main(String[] args) {
		int choice;
		
		loop:while (true) {
			System.out.println("1. add student");
			System.out.println("2. show all students");
			System.out.println("3. get student by roll number");
			System.out.println("4. show students in course");
			System.out.println("5. exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				addStudent();
				break;
			case 2:
				showAllStudents();
				break;
			case 3:
				findStudent();
				break;
			case 4:
				showCourseStudents();
				break;
			case 5:
				break loop;
			}
		}
		sc.close();
	}

	private static void showCourseStudents() {
		System.out.println("Enter the name of the course");
		String name = sc.next();
		Course course = studSch.getCourse(name);
		if (course == null) {
			System.out.println("invalid course");
			return;
		}
		Iterator<Integer> iter = course.getStudents();
		while(iter.hasNext()) {
			System.out.println(studSch.getStudent(iter.next()));
		}
	}

	private static void findStudent() {
		System.out.println("Enter the roll number of the student to find");
		int num = sc.nextInt();
		
		System.out.println(studSch.getStudent(num));
	}

	private static void showAllStudents() {
		studSch.showAllStudents();
		
	}

	private static void addStudent() {
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter the number of courses");
		int num = sc.nextInt();
		
		//String[] courses = new String[num];
		System.out.println(studSch.addStudent(rollNumber, name));
		
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the name of course " + (i+1));
			String courseName = sc.next();
			Course course = studSch.getCourse(courseName);
			if (course == null) {
				studSch.addCourse(courseName);
				course = studSch.getCourse(courseName);
			}
			
			studSch.getStudent(rollNumber).addCourse(courseName);
			course.addStudent(rollNumber);
		}
		
		//System.out.println(studSch.addStudent(rollNumber, name));
	}
}
