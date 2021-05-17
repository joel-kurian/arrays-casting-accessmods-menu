package com.capgemini.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@org.springframework.web.bind.annotation.RestControllerAdvice
public class RestControllerAdvice {
	
	@ExceptionHandler(EmployeeExistsException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public String employeeExistsException(EmployeeExistsException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public String employeeNotFoundException(EmployeeNotFoundException ex) {
		return ex.getMessage();
	}
}
