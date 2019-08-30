package com.revature.instruments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class CollectionDriver {
	
	private static Scanner sc =new Scanner(System.in);
	private static List<Instrument> instrumentList= new ArrayList<Instrument>();
	private static Orchestra z = new Orchestra();

	public static void main(String[] args) {
//		instrumentCollection();
//		orchestraExample();
		menu();
	}
	
	private static void menu() {
		System.out.println("---------------------------------------");
		System.out.println("Choose an option:");
		System.out.println("1:Bring in Orchestra 2:Add Trombone, 3:View Orchestra List, 4:Start Performance, 5:End Performance, 6:exit");
		System.out.println("---------------------------------------");
		int userOption = sc.nextInt();
		switch(userOption) {
		case 1:
			addOrchestra();
			break;
		case 2:
			addTrombone();
			break;
		case 3:
			orchestraList();
			break;
		case 4:
			orchestraExample();
			break;
		case 5:
			orchestraExample2();
			break;
		case 6:
			System.out.println("Exiting Program");
			System.exit(0);
			break;
		}
		menu();
	}
	
	public static void addOrchestra() {
		instrumentList.add(new Trombone("Albert"));
		instrumentList.add(new Tuba("Einstein", "boom"));
		instrumentList.add(new Trumpet("Rony", "boop"));
		instrumentList.add(new Flute("Karen", "yeet"));
		instrumentList.add(new Trombone("Ned", "VROom", "Trombone"));
		instrumentList.add(new Tuba("Yeet", "2"));
		instrumentList.add(new Trumpet());
		instrumentList.add(new Flute());
		try {
			instrumentList.add(new Trombone("Allen", -2));
		} catch (NegativeNumberException e) {
			System.out.println("Cannot create instrument:");
			System.out.println(e.getMessage());
		}
		System.out.println("The Orchestra is seated");
	}
	
	public static void orchestraList() {
		Queue<Instrument> instrumentQueue = new LinkedList<Instrument>(instrumentList);
		while(instrumentQueue.size() > 0) {
//			System.out.println("Queue size: " + instrumentQueue.size());
//			System.out.println("Next item: " + instrumentQueue.poll());
			System.out.println(instrumentQueue.poll());
		}
		System.out.println("There are " + instrumentList.size() + " Players");		

	}
	
	private static void addTrombone() {
		System.out.println("Enter name of new Trombone player:");
		String enterName = sc.next();
		instrumentList.add(new Trombone(enterName));
		System.out.println("Added " + enterName + " to list.");
	}

	

	private static void orchestraExample() {
		z.performance();
	}
	
	private static void orchestraExample2() {
//		Orchestra o = new Orchestra();
		z.endPerformance();
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
		
//		System.out.println(instrumentList);
		
		Queue<Instrument> instrumentQueue = new LinkedList<Instrument>(instrumentList);
		
		while(instrumentQueue.size() > 0) {
//			System.out.println("Queue size: " + instrumentQueue.size());
//			System.out.println("Next item: " + instrumentQueue.poll());
			System.out.println(instrumentQueue.poll());
		}
		try {
			instrumentList.add(new Trumpet("zoom", "beep", "Electric Trumpet"));
			instrumentList.add(new Trombone("Allen", -2));
		} catch (NegativeNumberException e) {
//			e.printStackTrace();
			System.out.println("Cannot create instrument:");
			System.out.println(e.getMessage());
		}
		
		System.out.println("There are " + instrumentList.size() + " Players");		
	}
}