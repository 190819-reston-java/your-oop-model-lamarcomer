package com.revature.instruments;

import java.io.Serializable;

public class Flute extends Instrument implements Serializable, WindInstrument {

	public static int numberOfFlutes = 0;
	public static int chair = 1;
	
	public Flute(String name, String sound, String type, int number) {
		super(name, sound, type, number);
		numberOfFlutes++;
		chair++;
	}

	public Flute(String name, String sound, String type) {
		this(name, sound, type, chair);
	}

	public Flute(String name, String sound) {
		this(name, sound, "Flute");
	}

	public Flute(String name) {
		this(name, "hweet");
	}

	public Flute() {
		this("Flute player");
	}
	
	public void breathe() {
		System.out.println(this.getName() + " is breathing");
	}
	@Override
	public void play() {
		System.out.println(this.getName() + " is playing on flute");
	}
	
	@Override
	public void tune() {
		System.out.println(this.getName() + " is tuning on flute");
	}

}
