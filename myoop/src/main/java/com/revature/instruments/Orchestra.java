package com.revature.instruments;

import java.util.ArrayList;
import java.util.Collection;

public class Orchestra extends ArrayList<Instrument> {

	private boolean performing;
	
	public Orchestra() {
	}

	public Orchestra(int initialCapacity) {
		super(initialCapacity);
	}

	public Orchestra(Collection<? extends Instrument> c) {
		super(c);
	}
	
	public void performance() {
		if(performing!=true) {
			performing= true;
			System.out.println("The Orchestra is performing");
		} else {
			System.out.println("The Orchestra is already performing");
		}
	}
	
	public void endPerformance() {
		if(performing) {
			System.out.println("The Orchestra performance is ending");
			performing = !performing;
		} else {
			System.out.println("Orchestra must be performing to end the performance");
		}
	}

}
