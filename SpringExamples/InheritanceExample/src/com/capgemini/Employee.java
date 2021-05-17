package com.capgemini;

import org.springframework.beans.factory.annotation.Required;

public class Employee{
	private int empID;
	private String empName;
	//private Address address;
	
	public int getEmpID() {
		return empID;
	}
	
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	/* public Address getAddress() { return address; } */
	 
	/* public void setAddress(Address address) { this.address = address; } */
	 
}
