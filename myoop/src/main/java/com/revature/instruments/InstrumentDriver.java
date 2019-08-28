package com.revature.instruments;

public class InstrumentDriver {

	public static void main(String[] args) {
		System.out.println(new Trombone("Trombone guy"));
		
		System.out.println(new Trumpet("Randy Savage"));
		
		Trombone t = new Trombone("Brent");
		t.play();
		
		Instrument b = new Tuba("Brady");
		b.tune();
		
		System.out.println("There are " + b.numberOfInstruments + " Instruments");
		System.out.println("There are " + ((Trombone) t).numberOfTrombones + " Trombones");
	}

}
