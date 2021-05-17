package com.capgemini;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainapp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		//context.registerShutdownHook();
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp.getEmpID());
		System.out.println(emp.getEmpName());
		//System.out.println(emp.getAddresses().toString());
	}
}
