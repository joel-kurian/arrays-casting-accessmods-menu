package com.capgemini;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Employee{
	private int empID;
	private List<String> empNames;
	//private Address address;
	
	public int getEmpID() {
		return empID;
	}
	
	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public List<String> getEmpNames() {
		return empNames;
	}

	public void setEmpNames(List<String> empNames) {
		this.empNames = empNames;
	}
	
	/* public Address getAddress() { return address; } */
	 
	/* public void setAddress(Address address) { this.address = address; } */
	 
}
