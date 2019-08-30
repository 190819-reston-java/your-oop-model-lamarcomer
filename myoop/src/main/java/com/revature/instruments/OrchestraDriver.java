package com.revature.instruments;

import java.util.ArrayList;
import java.util.List;

public class OrchestraDriver {

	private static List<Instrument> instrumentList= new ArrayList<Instrument>();
	
	public static void main(String[] args) {
		instrumentList.add(new Trombone("Albert"));
		instrumentList.add(new Tuba("Einstein", "boom"));
		instrumentList.add(new Trumpet("Rony", "boop"));
		instrumentList.add(new Flute("Karen", "yeet"));
		instrumentList.add(new Trombone("Ned", "VROom", "Trombone"));
		instrumentList.add(new Tuba("Yeet", "2"));
		instrumentList.add(new Trumpet());
		instrumentList.add(new Flute());
		orchestraExample();
	}

	private static void orchestraExample() {
		Orchestra o = new Orchestra(instrumentList);
		System.out.println(o);
		o.performance();
	}

}
