package com.companyname.springbootcrudrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NextGenException extends RuntimeException {
	
	private static final long serialVersionUID = 5559437509153646182L;

	public NextGenException(String message,Throwable cause,boolean suppression,boolean stacktrace) {
		super(message,cause);		
	}
	
}
