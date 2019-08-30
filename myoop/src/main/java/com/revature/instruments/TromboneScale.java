package com.revature.instruments;

import java.util.Comparator;

public class TromboneScale implements Comparator<Trombone> {
	
	public int compare(Trombone m1, Trombone m2) {
		int out = 0;
		long tromboneNumber1 = m1.getNumber();
		long tromboneNumber2 = m2.getNumber();
		out = (int) (tromboneNumber1 - tromboneNumber2);
		if(out==0) {
			out = m1.compareTo(m2);
		}
		
		return out;
	}

}