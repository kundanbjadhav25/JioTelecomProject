package com.reliance.jio.telecom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * @author Kundan
 */
@ResponseStatus(HttpStatus.NOT_FOUND) 
public class ConnectionTypeException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ConnectionTypeException(String message){
		super(message); 
	}

}
