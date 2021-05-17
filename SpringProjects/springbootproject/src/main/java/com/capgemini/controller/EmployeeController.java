package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.capgemini.entity.Employee;
import com.capgemini.exceptions.EmployeeExistsException;
import com.capgemini.exceptions.EmployeeNotFoundException;
import com.capgemini.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployeeDetails() {
		return es.getAllEmployeeDetails();
	}
	
	@GetMapping("/employee/{empId}")
	public Employee getEmployeeById(@PathVariable String empId) throws EmployeeNotFoundException {
		//try {
			return es.getEmployeeById(empId);
		//} catch (EmployeeNotFoundException e) {
			//throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		//}
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee e) throws EmployeeExistsException {
		//try {
			return es.addEmployee(e);
		//} catch (EmployeeExistsException e1) {
			//throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e1.getMessage());
		//}
	}
	
	@DeleteMapping("/delete")
	public void deleteEmployee(@RequestBody Employee e) throws EmployeeNotFoundException {
		//try {
			es.deleteEmployee(e);
		//} catch (EmployeeNotFoundException e1) {
			//throw new ResponseStatusException(HttpStatus.NOT_FOUND, e1.getMessage());
		//}
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee e) throws EmployeeNotFoundException {
		//try {
			return es.updateEmployee(e);
		//} catch (EmployeeNotFoundException e1) {
			//throw new ResponseStatusException(HttpStatus.NOT_FOUND, e1.getMessage());
		//}
	}
	
	@GetMapping("/employeebyname/{name}")
	public List<Employee> getEmployeeDetailsByName(@PathVariable String name)
	{
		return es.getEmployeeDetailsByName(name);
	}
	
	
	@GetMapping("/employeebysalrange/{low}/{high}")
	public List<Employee> getEmployeeDetailsBySalaryRange(@PathVariable double low,@PathVariable double high)
	{
		return es.getEmployeeDetailsBySalRange(low, high);
	}
}
