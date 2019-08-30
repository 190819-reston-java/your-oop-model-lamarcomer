package com.revature.instruments;

public class InstrumentDriver {

	public static void main(String[] args) {
		System.out.println(new Trombone("Trombone guy"));

		System.out.println(new Trumpet("Randy Savage"));

		Trombone t = new Trombone("Brent");
		t.play();
		t.breathe();
		t.tune();
		
		Tuba d = new Tuba("Brady");
		d.tune();
		
		Flute c = new Flute("Pamela");
		c.play();
		
		Trumpet o = new Trumpet();	
		if (((Trombone) t).numberOfTrombones == 1) {
			System.out.println("There is " + ((Trombone) t).numberOfTrombones + " Trombone");
			
		} else if (((Trombone) t).numberOfTrombones > 1 | ((Trombone) t).numberOfTrombones == 0) {
			System.out.println("There are " + ((Trombone) t).numberOfTrombones + " Trombones");
			
		} else {
			System.out.println("There are " + ((Trombone) t).numberOfTrombones + " Trombones");
			
		}

		if (((Tuba) d).numberOfTubas == 1) {
			System.out.println("There is " + ((Tuba) d).numberOfTubas + " Tuba");
		} else {
			System.out.println("There are " + ((Tuba) d).numberOfTubas + " Tubas");
			
		}

		if (((Flute) c).numberOfFlutes == 1) {
			System.out.println("There is " + ((Flute) c).numberOfFlutes + " Flute");
		} else {
			System.out.println("There are " + ((Flute) c).numberOfFlutes + " Flutes");
			
		}

		if (((Trumpet) o).numberOfTrumpets == 1) {
			System.out.println("There is " + ((Trumpet) o).numberOfTrumpets + " Trumpet");
		} else {
			System.out.println("There are " + ((Trumpet) o).numberOfTrumpets + " Trumpets");
			
		}

		if (d.numberOfInstruments == 1) {
			System.out.println("There is " + d.numberOfInstruments + " Total Instrument");
		} else {
			System.out.println("There are " + d.numberOfInstruments + " Total Instruments");
			
		}

	}
}
