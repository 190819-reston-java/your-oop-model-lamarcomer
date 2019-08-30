package com.revature.instruments;

import java.io.Serializable;

public class Tuba extends Instrument implements Serializable, BrassInstruments {
	
	public static int numberOfTubas = 0;
	public static int chair = 1;

	public Tuba(String name, String sound, String type, int number) {
		super(name, sound, type, number);
		numberOfTubas++;
		chair++;
	}
	public Tuba(String name, String sound, String type) {
		this(name, sound, type, chair);
	}

	public Tuba(String name, String sound) {
		this(name, sound, "Tuba");
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
