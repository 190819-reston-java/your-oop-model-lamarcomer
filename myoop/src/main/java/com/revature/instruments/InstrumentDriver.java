package com.revature.instruments;

public class InstrumentDriver {

	public static void main(String[] args) {
		System.out.println(new Trombone("Trombone guy"));

		System.out.println(new Trumpet("Randy Savage"));

		Trombone t = new Trombone("Brent");
		t.play();
		t.breathe();

		Instrument b = new Tuba("Brady");
		b.tune();

		Tuba d = new Tuba();

		Flute c = new Flute("Pamela");
		c.play();

		Trumpet o = new Trumpet();
		
		Flute r = new Flute();
		
		if (((Trombone) t).numberOfTrombones == 1) {
			System.out.println("There is " + ((Trombone) t).numberOfTrombones + " Trombone");
			
		} else if (((Trombone) t).numberOfTrombones > 1 | ((Trombone) t).numberOfTrombones == 0) {
			System.out.println("There are " + ((Trombone) t).numberOfTrombones + " Trombones");
			
		} else {
			System.out.println("There are " + ((Trombone) t).numberOfTrombones + " Trombones");
			
		}

		if (((Tuba) d).numberOfTubas == 1) {
			System.out.println("There is " + ((Tuba) d).numberOfTubas + " Tuba");
			
		} else if (((Tuba) d).numberOfTubas > 1 | ((Tuba) d).numberOfTubas == 0) {
			System.out.println("There are " + ((Tuba) d).numberOfTubas + " Tubas");
			
		} else {
			System.out.println("There are " + ((Tuba) d).numberOfTubas + " Tubas");
			
		}

		if (((Flute) c).numberOfFlutes == 1) {
			System.out.println("There is " + ((Flute) c).numberOfFlutes + " Flute");
			
		} else if (((Flute) c).numberOfFlutes > 1 | ((Flute) c).numberOfFlutes == 0) {
			System.out.println("There are " + ((Flute) c).numberOfFlutes + " Flutes");
			
		} else {
			System.out.println("There are " + ((Flute) c).numberOfFlutes + " Flutes");
			
		}

		if (((Trumpet) o).numberOfTrumpets == 1) {
			System.out.println("There is " + ((Trumpet) o).numberOfTrumpets + " Trumpet");
			
		} else if (((Trumpet) o).numberOfTrumpets > 1 | ((Trumpet) o).numberOfTrumpets == 0) {
			System.out.println("There are " + ((Trumpet) o).numberOfTrumpets + " Trumpets");
			
		} else {
			System.out.println("There are " + ((Trumpet) o).numberOfTrumpets + " Trumpets");
			
		}

		if (b.numberOfInstruments == 1) {
			System.out.println("There is " + b.numberOfInstruments + " Total Instrument");
			
		} else if (b.numberOfInstruments > 1 | b.numberOfInstruments == 0) {
			System.out.println("There are " + b.numberOfInstruments + " Total Instruments");
			
		} else {
			System.out.println("There are " + b.numberOfInstruments + " Total Instruments");
			
		}

	}
}
