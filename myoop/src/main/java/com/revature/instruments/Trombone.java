package com.revature.instruments;

import java.io.Serializable;

public class Trombone extends Instrument implements Serializable, BrassInstruments, Comparable<Trombone> {	
	
	public static int numberOfTrombones = 0;
	public static int chair = 1;
	
	public Trombone(String name, String sound, String type, int number) {
		super(name, sound, type, number);
		numberOfTrombones++;
		chair++;
	}
	public Trombone(String name, String sound, String type) {
		this(name, sound, type, chair);
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
	
	public Trombone(String name, int number) {
		super(name, "Fortnite", "Trombone", number);
		numberOfTrombones++;
		chair++;
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
	
	public int compareTo(Trombone m) {
		return this.getName().compareTo(m.getName());
	}
}
