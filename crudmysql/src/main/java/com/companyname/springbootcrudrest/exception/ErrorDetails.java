package com.companyname.springbootcrudrest.exception;

import java.util.Date;

public class ErrorDetails {
	
	private String message;
	private String details;
	private Throwable cause;

	public ErrorDetails(Throwable cause, String message, String details) {
		super();
		
		this.message = message;
		this.details = details;
		this.cause = cause;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	public Throwable getCause() {
		return cause;
	}
}
