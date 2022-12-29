package com.reliance.jio.telecom.exception;
// custom exception class
/**
 * 
 * @author Kundan
 *
 */
public class UserException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// passing message if exception occur
	public UserException(String message) {
		super();
		System.out.println(message);
	}
}
