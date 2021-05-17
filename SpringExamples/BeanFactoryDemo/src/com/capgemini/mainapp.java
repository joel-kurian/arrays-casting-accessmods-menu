package com.capgemini;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class mainapp {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		//context.registerShutdownHook();
		System.out.println("Geting bean");
		Employee emp = (Employee) factory.getBean("emp1");
        
		System.out.println(emp.getEmpID());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getAddresses().toString());
	}
}
