package com.capgemini.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String> {
	
	@Query("FROM Employee WHERE name=:empName")
	List<Employee> getEmployeeDetailsByName(@Param("empName") String name);
	
	@Query("FROM Employee WHERE salary>=:lower AND salary<=:higher")
	List<Employee> getEmployeeDetailsBySalRange(@Param("lower") double low, @Param("higher") double high);
}
