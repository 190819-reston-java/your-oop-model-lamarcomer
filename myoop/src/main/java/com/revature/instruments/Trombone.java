package com.revature.instruments;

import java.io.Serializable;

public class Trombone extends Instrument implements Serializable, BrassInstruments {
	
	public static int numberOfTrombones = 0;
	
	public Trombone(String name, String sound, String type) {
		super(name, sound, type);
		numberOfTrombones++;
	}

	public Trombone(String name, String sound) {
		this(name, sound, "Trombone");
	}

	public Trombone(String name) {
		this(name, "Brrp");
	}

	public Trombone() {
		this("Trombone player");
	}
	public static void printPopulation() {
		if(numberOfTrombones == 0) {
			System.out.println("No trombone players");
		} else {
			System.out.println("There are:" + numberOfTrombones + " Trombones");
		}
	}
	
	public void breathe() {
		System.out.println(this.getName() + " is breathing");
	}
	
	@Override
	public void play() {
		System.out.println(this.getName() + " is playing on trombone");
	}
	
	@Override
	public void tune() {
		System.out.println(this.getName() + " is tuning on trombone");
	}
}
