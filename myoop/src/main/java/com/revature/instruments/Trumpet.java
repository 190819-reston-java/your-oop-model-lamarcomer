package com.revature.instruments;

import java.io.Serializable;

public class Trumpet extends Instrument implements Serializable {

	public Trumpet(String name, String sound, String type) {
		super(name, sound, type);
		// TODO Auto-generated constructor stub
	}

	public Trumpet(String name, String sound) {
		super(name, sound, "Trumpet");
		// TODO Auto-generated constructor stub
	}

	public Trumpet(String name) {
		super(name, "boop");
		// TODO Auto-generated constructor stub
	}

	public Trumpet() {
		// TODO Auto-generated constructor stub
		this("Trumpet player");
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
