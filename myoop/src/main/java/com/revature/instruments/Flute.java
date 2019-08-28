package com.revature.instruments;

import java.io.Serializable;

public class Flute extends Instrument implements Serializable {

	public Flute(String name, String sound, String type) {
		super(name, sound, type);
		// TODO Auto-generated constructor stub
	}

	public Flute(String name, String sound) {
		this(name, sound, "Flute");
		// TODO Auto-generated constructor stub
	}

	public Flute(String name) {
		this(name, "hweet");
		// TODO Auto-generated constructor stub
	}

	public Flute() {
		// TODO Auto-generated constructor stub
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
