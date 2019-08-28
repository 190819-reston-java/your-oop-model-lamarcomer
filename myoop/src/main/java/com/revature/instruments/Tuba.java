package com.revature.instruments;

import java.io.Serializable;

public class Tuba extends Instrument implements Serializable {

	public Tuba(String name, String sound, String type) {
		super(name, sound, type);
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

	@Override
	public void play() {
		System.out.println(this.getName() + " is playing on tuba");
	}
	
	@Override
	public void tune() {
		System.out.println(this.getName() + " is tuning on tuba");
	}

}
