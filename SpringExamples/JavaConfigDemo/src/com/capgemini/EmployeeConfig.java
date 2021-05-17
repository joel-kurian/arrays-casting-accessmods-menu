package com.capgemini;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	
	@Bean(name="employee")
	public Employee getEmployee() {
		return new Employee();
	}
}
