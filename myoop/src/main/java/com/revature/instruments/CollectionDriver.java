package com.revature.instruments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CollectionDriver {

	public static void main(String[] args) {
		instrumentCollection();
//		instrumentCollection2();
	}
	public static void instrumentCollection() {
		
		List<Instrument> instrumentList = new ArrayList<Instrument>();
		instrumentList.add(new Trombone("Albert"));
		instrumentList.add(new Tuba("Einstein", "boom"));
		instrumentList.add(new Trumpet("Rony", "boop"));
		instrumentList.add(new Flute("Karen", "yeet"));
		instrumentList.add(new Trombone("Ned", "VROom", "Bass Trombone"));
		instrumentList.add(new Tuba());
		
		System.out.println(instrumentList);
		
		Queue<Instrument> instrumentQueue = new LinkedList<Instrument>(instrumentList);
		
		
		while(instrumentQueue.size() > 0) {
			System.out.println("Queue size: " + instrumentQueue.size());
			System.out.println("Next item: " + instrumentQueue.poll());
		}
		
		System.out.println(instrumentQueue);
	}

	public static void instrumentCollection2() {
		Set<Instrument> instrumentSet = new HashSet<Instrument>();
		instrumentSet.add(new Trumpet());
		instrumentSet.add(new Trumpet());
		instrumentSet.add(new Trombone());
		instrumentSet.add(new Tuba());
	}
}