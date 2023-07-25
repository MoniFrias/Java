package com.example.demo.linkedListJavaUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListUseJavaUtil {

	LinkedList<String> names = new LinkedList<>();	
	
	public LinkedList<String> insertElements(){
		List<String> listNames1 = new ArrayList<>();
		listNames1.add("Alex");
		listNames1.add("Carlos");
		List<String> listNames2 = new ArrayList<>();
		listNames2.add("Maria");
		listNames2.add("Artur");
		
		names.add("Josh");
		names.addFirst("Luis");
		names.addLast("Carla");
		names.add(2, "Andrea");
		System.out.println(names);
		names.addAll(listNames1);
		System.out.println(names);
		names.addAll(1, listNames2);
		return names;
	}
	
	public boolean search(String value) {
		return names.contains(value);
	}
	
	public LinkedList<String> getAllElements(){
		return names;
	}
	
	public void iterarElements(){		
		for (int i = 0; i < names.size(); i++) { 	
			int index = i+1;
            System.out.print(index+ ". " + names.get(i) + "\n"); 
        } 
	}
	
	public LinkedList<String> update(int index, String value){
		names.set(index, value);
		return names;
	}
	
	public LinkedList<String> removeElements(){
		names.remove(3); //index
		names.remove("Andrea");
		names.removeFirst();
		names.removeLast();
		return names;
	}
}
