package com.example.demo;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

enum Names {
	Karen, Josh, Liz, Alex, Carlos
};

public class SetClass {

	int count = 1;

	public void hashSetMethod() {
		Set<String> h = new HashSet<String>();
		h.add("Alex");
		h.add("Charles");
		h.add("Luis");
		// Adding the duplicate element
		h.add("Alex");
		System.out.println("Set: " + h);
		h.remove("Luis");
		System.out.println("Set after removing Luis: " + h);
		System.out.println("Contains Alex: " + h.contains("Alex"));
		System.out.println("Size: " + h.size());

	}

	public void enumSetMethod() {
		Set<Names> set1;

		// Adding the elements
		set1 = EnumSet.of(Names.Alex, Names.Karen, Names.Josh);

		System.out.println("Set 1: " + set1);
	}

	public void linkedHashSetMethod() {
		Set<String> lh = new LinkedHashSet<String>();

		// Adding elements into the LinkedHashSet
		lh.add("Carlos");
		lh.add("George");
		lh.add("Sergio");

		// Adding the duplicate
		lh.add("George");

		// Displaying the LinkedHashSet
		System.out.println(lh);

		// Removing items from LinkedHashSet
		lh.remove("Carlos");
		System.out.println("Set after removing " + "Carlos:" + lh);

		// Iterating over linked hash set items
		System.out.println("Iterating:");
		Iterator<String> i = lh.iterator();
		while (i.hasNext()) {
			System.out.println(count + "." + i.next());
			count++;
		}

	}

	public void treeSetMethod() {
		// Creating a Set object and declaring it of String with reference to TreeSet
		Set<String> ts = new TreeSet<String>();

		// Adding elements into the TreeSet
		ts.add("Carlos");
		ts.add("George");
		ts.add("Sergio");

		// Adding the duplicate
		ts.add("George");

		// Displaying the TreeSet
		System.out.println(ts);

		// Removing items from TreeSet
		ts.remove("Carlos");
		System.out.println("Set after removing " + "Carlos:" + ts);

		// Iterating over Tree set items
		System.out.println("Iterating over set:");
		Iterator<String> i = ts.iterator();

		while (i.hasNext())
			System.out.println(i.next());
	}
}
