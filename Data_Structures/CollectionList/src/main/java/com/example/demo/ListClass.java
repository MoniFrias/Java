package com.example.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListClass {

	public void listWithArrayList() {
		// Creating an object of List interface implemented by the ArrayList class
		// Does'nt work with primitive datatypes, have to use wrapper classes
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list1.add(0, 1);
		list1.add(1, 2);

		list2.add(3);
		list2.add(2);
		list2.add(4);
		list2.add(5);

		list1.addAll(1, list2);
		System.out.println("\n" + list1);
		list1.remove(1); // Specific index

		// Printing the updated List 1
		System.out.println("List after removed index 1: \n" + list1);

		// Prints element at index 3 in list 1
		System.out.println("\nValue at index 3 is: " + list1.get(3));

		// Replace 0th element with 5
		list1.set(0, 6);

		// Again printing the updated List 1
		System.out.println("\n" + list1);

		int index = list1.indexOf(2);
		System.out.println("\nThe first occurrence of '2' is at index: " + index);

		int lastIndex = list1.lastIndexOf(2);
		System.out.println("The last occurrence of '2' is at index: " + lastIndex);

		System.out.println("\nIs number 4 present in the list? " + list1.contains(4));
		System.out.println("\nSize: " + list1.size());
	}
	
	
	public void listWithVector() {
		// Size of the vector
        int n = 5;
		// Creating an object of List interface implemented by the Vector class
        List<Integer> v = new Vector<Integer>(n);
        for (int i = 1; i <= n; i++) {
            v.add(i);
        }
        
		// Printing list
		System.out.println("\n" + v);

		// Prints element at index 3 in list 1
		System.out.println("\nValue at index 3 is: " + v.get(3));

		// Replace 0th element with 5
		v.set(4, 2);

		// Again printing the updated List 1
		System.out.println("\n" + v);

		int index = v.indexOf(2);
		System.out.println("\nThe first occurrence of '2' is at index: " + index);

		int lastIndex = v.lastIndexOf(2);
		System.out.println("The last occurrence of '2' is at index: " + lastIndex);

		System.out.println("\nIs number 4 present in the list? " + v.contains(4));
		System.out.println("\nSize: " + v.size());
		
		// Remove element at index 3
		v.remove(3);
		// Again printing the updated List 1
		System.out.println("List after removed index 3: \n" + v);
		
	}
	
	public void listWithStack() {
		// Size of the vector
        int n = 5;
		// Creating an object of List interface implemented by the Stack class
        List<Integer> s = new Stack<Integer>();
        for (int i = 1; i <= n; i++) {
            s.add(i);
        }
        
		// Printing list
		System.out.println("\n" + s);

		// Prints element at index 3 in list 1
		System.out.println("\nValue at index 3 is: " + s.get(3));

		// Replace 0th element with 5
		s.set(4, 2);

		// Again printing the updated List 1
		System.out.println("\n" + s);

		int index = s.indexOf(2);
		System.out.println("\nThe first occurrence of '2' is at index: " + index);

		int lastIndex = s.lastIndexOf(2);
		System.out.println("The last occurrence of '2' is at index: " + lastIndex);

		System.out.println("\nIs number 4 present in the list? " + s.contains(4));
		System.out.println("\nSize: " + s.size());
		
		// Remove element at index 3
		s.remove(3);
		// Again printing the updated List 1
		System.out.println("List after removed index 3: \n" + s);
		
	}
	
	public void listWithLinkedList() {
		// Size of the vector
        int n = 5;
		// Creating an object of List interface implemented by the Linkedlist class
        List<Integer> l = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++) {
            l.add(i);
        }
        
		// Printing list
		System.out.println("\n" + l);

		// Prints element at index 3 in list 1
		System.out.println("\nValue at index 3 is: " + l.get(3));

		// Replace 0th element with 5
		l.set(0, 6);

		// Again printing the updated List 1
		System.out.println("\n" + l);

		int index = l.indexOf(2);
		System.out.println("\nThe first occurrence of '2' is at index: " + index);

		int lastIndex = l.lastIndexOf(2);
		System.out.println("The last occurrence of '2' is at index: " + lastIndex);

		System.out.println("\nIs number 4 present in the list? " + l.contains(4));
		System.out.println("\nSize: " + l.size());
		
		// Remove element at index 3
		l.remove(3);
		// Again printing the updated List 1
		System.out.println("List after removed index 3: \n" + l);
		
	}

}
