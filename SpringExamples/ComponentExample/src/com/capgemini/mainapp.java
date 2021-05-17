package com.capgemini;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainapp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.registerShutdownHook();
		Employee emp = (Employee) context.getBean("employee");
        
		System.out.println(emp.getEmpID());
		System.out.println(emp.getEmpName());
		//System.out.println(emp.getAddress().getCity());
	}
}
