package com.revature.instruments;

public class NegativeNumberException extends RuntimeException {

	public NegativeNumberException() {
		super("Instrument number cannot be a negative number");
	}
	
	public NegativeNumberException(String message) {
		super(message);
	}
}
