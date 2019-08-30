package com.revature.instruments;

public abstract class Instrument {
	
	public static int numberOfInstruments;

	private String name;
	private String sound;
	private String type;
	private int number;
	

	public Instrument(String name, String sound, String type, int number) {
		super();
		this.name = name;
		this.sound = sound;
		this.type = type;
		this.setNumber(number);
		numberOfInstruments++;
	}
	
	public Instrument(String name, String sound, String type) {
		this(name, sound, type, numberOfInstruments);
	}
	public Instrument(String name, String sound) {
		this(name, sound, "orchestra");
	}
	
	public Instrument(String name) {
		this(name, "wom");
	}
	
	public Instrument() {
		this("Violin");
	}
	
	public void play() {
		System.out.println( this.name + " is playing");
	}
	
	public void tune() {
		System.out.println( this.name + " is tuning");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if(number < 0) {
			throw new NegativeNumberException();
		}
			this.number = number;
	}

	@Override
	public String toString() {
		return "Instrument [name:" + name + ", sound:" + sound + ", type:" + type + ", number: " + number + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sound == null) ? 0 : sound.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instrument other = (Instrument) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sound == null) {
			if (other.sound != null)
				return false;
		} else if (!sound.equals(other.sound))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
}

