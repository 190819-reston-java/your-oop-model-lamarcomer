package com.revature.instruments;

import java.io.Serializable;

public class Flute extends Instrument implements Serializable {

	public static int numberOfFlutes = 0;
	
	public Flute(String name, String sound, String type) {
		super(name, sound, type);
		numberOfFlutes++;
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
	
	@Override
	public void play() {
		System.out.println(this.getName() + " is playing on flute");
	}
	
	@Override
	public void tune() {
		System.out.println(this.getName() + " is tuning on flute");
	}

}
