package com.revature.instruments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
public class CollectionDriver {
	
	private static List<Instrument> instrumentList= new ArrayList<Instrument>();

	public static void main(String[] args) {
		instrumentCollection();
//		instrumentCollection2();
		orchestraExample();
	}
	public static void instrumentCollection() {
		
//		List<Instrument> instrumentList = new ArrayList<Instrument>();
		instrumentList.add(new Trombone("Albert"));
		instrumentList.add(new Tuba("Einstein", "boom"));
		instrumentList.add(new Trumpet("Rony", "boop"));
		instrumentList.add(new Flute("Karen", "yeet"));
		instrumentList.add(new Trombone("Ned", "VROom", "Trombone"));
		instrumentList.add(new Tuba("Yeet", "2"));
		instrumentList.add(new Trumpet());
		instrumentList.add(new Flute());
		try {
			instrumentList.add(new Trumpet("zoom", "beep", "Electric Trumpet"));
			instrumentList.add(new Trombone("Allen", -2));
		} catch (NegativeNumberException e) {
//			e.printStackTrace();
			System.out.println("Cannot create instrument:");
			System.out.println(e.getMessage());
		}
//		try {
//			instrumentList.add(new Tuba("Patrick", "Is Mayonnaise an instrument", "Mayonnaise"));
//			if(List<Instrument>.type=="Mayonnaise") {
//				throw new Exception();
//			}
//		} catch (RuntimeException d) {
//			System.out.println("Is mayonnaise an instrument?");
//			System.out.println(d.getMessage());
//		}
		
//		System.out.println(instrumentList);
		
		Queue<Instrument> instrumentQueue = new LinkedList<Instrument>(instrumentList);
		
		System.out.println("There are " + instrumentList.size() + " Players");
		
		while(instrumentQueue.size() > 0) {
//			System.out.println("Queue size: " + instrumentQueue.size());
//			System.out.println("Next item: " + instrumentQueue.poll());
			System.out.println(instrumentQueue.poll());
		}
		
	}

	public static void instrumentCollection2() {
		Set<Instrument> instrumentSet = new HashSet<Instrument>();
		instrumentSet.add(new Trumpet());
		instrumentSet.add(new Trumpet());
		instrumentSet.add(new Trombone());
		instrumentSet.add(new Tuba());
		System.out.println(instrumentSet);
	}
	
	private static void orchestraExample() {
		Orchestra o = new Orchestra(instrumentList);
		System.out.println("The performance will start soon");
		o.performance();
		o.endPerformance();
	}
}