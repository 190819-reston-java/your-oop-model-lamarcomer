package com.revature.instruments;

public class InstrumentException extends Exception {
	
	public InstrumentException() {
		super("No patrick, mayonnaise is not an instrument.");
	}
	
	public InstrumentException(String message) {
		super(message);
	}
}
