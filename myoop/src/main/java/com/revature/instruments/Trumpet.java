package com.revature.instruments;

import java.io.Serializable;

public class Trumpet extends Instrument implements Serializable, BrassInstruments {
	
	public static int numberOfTrumpets = 0;
	public static int chair = 1;

	public Trumpet(String name, String sound, String type, int number) {
		super(name, sound, type, number);
		numberOfTrumpets++;
		chair++;
	}
	public Trumpet(String name, String sound, String type) {
		this(name, sound, type, chair);
	}

	public Trumpet(String name, String sound) {
		this(name, sound, "Trumpet");
	}

	public Trumpet(String name) {
		this(name, "boop");
	}

	public Trumpet() {
		this("Trumpet player");
	}

	public void breathe() {
		System.out.println(this.getName() + " is breathing");
	}

	@Override
	public void play() {
		System.out.println(this.getName() + " is playing on trumpet");
	}

	@Override
	public void tune() {
		System.out.println(this.getName() + " is tuning on trumpet");
	}

}
