package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entity.Employee;
import com.capgemini.exceptions.EmployeeExistsException;
import com.capgemini.exceptions.EmployeeNotFoundException;
import com.capgemini.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo er;
	
	@Override
	public List<Employee> getAllEmployeeDetails() {
		return er.findAll();
	}
	
	@Override
	public Employee getEmployeeById(String id) throws EmployeeNotFoundException{
		return er.findById(id).orElseThrow(
				() -> new EmployeeNotFoundException("Employee not found"));
	}
	
	@Override
	public Employee addEmployee(Employee e) throws EmployeeExistsException {
		Optional<Employee> emp = er.findById(e.getEmpId());
		if (emp.isPresent()) {
			throw new EmployeeExistsException("Employee already exists");
		}
		return er.save(e);
	}
	
	@Override
	public void deleteEmployee(Employee e) throws EmployeeNotFoundException{
		er.findById(e.getEmpId()).orElseThrow(
				() -> new EmployeeNotFoundException("Employee not found"));
		er.delete(e);
	}
	
	@Override
	public Employee updateEmployee(Employee e) throws EmployeeNotFoundException {
		Employee emp = er.findById(e.getEmpId()).orElseThrow(
				() -> new EmployeeNotFoundException("Employee not found"));
		
		er.delete(emp);
		return er.save(e);
	}

	@Override
	public List<Employee> getEmployeeDetailsByName(String name) {
		return er.getEmployeeDetailsByName(name);
	}

	@Override
	public List<Employee> getEmployeeDetailsBySalRange(double low, double high) {
		return er.getEmployeeDetailsBySalRange(low, high);
	}
}
