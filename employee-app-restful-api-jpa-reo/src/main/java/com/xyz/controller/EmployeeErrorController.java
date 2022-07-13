package com.xyz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.xyz.exception.EmployeeAlreadyDeletedException;
import com.xyz.exception.EmployeeAlreadyExistException;
import com.xyz.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class EmployeeErrorController {

	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(EmployeeNotFoundException.class)
	public String handleEmployeeNotFoundException(Exception ex) {
		return ex.getMessage();
	}

	@ResponseStatus(code = HttpStatus.CONFLICT)
	@ExceptionHandler(EmployeeAlreadyExistException.class)
	public String handleEmployeeAlreadyExistsException(Exception ex) {
		return ex.getMessage();
	}

	@ResponseStatus(code = HttpStatus.ACCEPTED)
	@ExceptionHandler(EmployeeAlreadyDeletedException.class)
	public String handleEmployeeAlreadyDeletedException(Exception ex) {
		return ex.getMessage();
	}
}
