package com.capgemini;

import java.util.List;

public class Employee{
	
	public Employee(int empID, String empName) {
		System.out.println("Constructor");
		this.empID = empID;
		this.empName = empName;
	}

	private int empID;
	private String empName;
	//private List<Address> addresses;
	
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

	/*
	 * public List<Address> getAddresses() { return addresses; }
	 */

	/*
	 * public void setAddresses(List<Address> addresses) { this.addresses =
	 * addresses; }
	 */
}
