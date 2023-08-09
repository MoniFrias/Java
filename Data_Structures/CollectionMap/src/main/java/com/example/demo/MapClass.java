package com.example.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapClass {
	
	// Map doesn't allow duplicate keys
	
	public void printValues(Map<Integer, String> dictionary) {
		for (Entry<Integer, String> name : dictionary.entrySet()) {
			System.out.println("Key: " + name.getKey() + " Name: " + name.getValue());
		}
	}
	
	public void hashMapMethod() {
		Map<Integer, String> dictionary = new HashMap<>(); // hashMap no order needed
		dictionary.put(1, "Carlos");
		dictionary.put(2, "Charles");
		dictionary.put(3, "Luis");
		dictionary.put(4, "Alex");
		
		printValues(dictionary);	
		System.out.println("\n");
		
		dictionary.remove(2);
		printValues(dictionary);
		System.out.println("\n");
		dictionary.replace(1, "Karen");
		printValues(dictionary);
		System.out.println("\n");
		System.out.println("Size: " + dictionary.size());
		System.out.println("Size: " + dictionary.values());

	}
	
	public void linkedHashMapMethod() {
		Map<Integer, String> dictionary = new LinkedHashMap<>(); //hashMap no order needed
		dictionary.put(1, "Carlos");
		dictionary.put(2, "Charles");
		dictionary.put(3, "Luis");
		dictionary.put(4, "Alex");
		
		printValues(dictionary);

	}
	
	public void treeMapMethod() {
		Map<Integer, String> dictionary = new TreeMap<>(); //it is ordered by the key 
		dictionary.put(1, "Carlos");
		dictionary.put(2, "Charles");
		dictionary.put(3, "Luis");
		dictionary.put(4, "Alex");
		
		printValues(dictionary);

	}

}
