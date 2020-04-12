package com.companyname.springbootcrudrest.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice

public class NextGenExceptionHandler extends ResponseEntityExceptionHandler {

	/*
	 * @ExceptionHandler(NextGenApplicationException.class) public ResponseEntity<?>
	 * handleApplicationException(NextGenException ex, WebRequest request) {
	 * NextGenException error = new NextGenApplicationException(ex.getMessage());
	 * return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST); }
	 * 
	 * @ExceptionHandler(NextGenSystemException.class) public ResponseEntity<?>
	 * handleSystemException(NextGenException ex, WebRequest request) {
	 * NextGenException error = new NextGenSystemException(ex.getMessage()); return
	 * new ResponseEntity<>(error, HttpStatus.BAD_REQUEST); }
	 */

	@ExceptionHandler(NextGenException.class)
	public ResponseEntity<?> handleGenericException(NextGenException ex, WebRequest request) {
		//NextGenException error = new NextGenException(new Date(), ex.getMessage(), request.getDescription(false));
		ErrorDetails errorDetails = new ErrorDetails(ex.getCause(),ex.getMessage(),request.getDescription(false));
		System.out.println(ex.getMessage());
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}

	
	  @ExceptionHandler(ResourceNotFoundException.class) public ResponseEntity<?>
	  resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
	  ErrorDetails errorDetails = new ErrorDetails(ex.getCause(),ex.getMessage(),request.getDescription(false)); return new ResponseEntity<>(errorDetails,
	  HttpStatus.NOT_FOUND); }
	 

}
