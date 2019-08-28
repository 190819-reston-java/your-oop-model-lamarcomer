package com.revature.instruments;

import java.io.Serializable;

public class Tuba extends Instrument implements Serializable, BrassInstruments {
	
	public static int numberOfTubas = 0;

	public Tuba(String name, String sound, String type) {
		super(name, sound, type);
		numberOfTubas++;
		// TODO Auto-generated constructor stub
	}

	public Tuba(String name, String sound) {
		this(name, sound, "Tuba");
		// TODO Auto-generated constructor stub
	}

	public Tuba(String name) {
		this(name, "oomph");
	}

	public Tuba() {
		this("Tuba Player");
	}
	
	public void breathe() {
		System.out.println(this.getName() + " is breathing");
	}

	@Override
	public void play() {
		System.out.println(this.getName() + " is playing on tuba");
	}
	
	@Override
	public void tune() {
		System.out.println(this.getName() + " is tuning on tuba");
	}

}
