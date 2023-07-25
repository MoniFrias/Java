package com.example.demo;

import java.util.LinkedList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.circularLinkedList.CircularLinkedList;
import com.example.demo.doublyLinkedList.DoublyLinkedList;
import com.example.demo.doublyLinkedList.Fraction;
import com.example.demo.linkedListJavaUtil.LinkedListUseJavaUtil;
import com.example.demo.singlyLinkedList.SinglyLinkedList;

@SpringBootApplication
public class LinkedListsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkedListsApplication.class, args);	
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1. Singly Linked List\n2. Doubly Linked List\n3. Circular Linked List"
				+ "\n4. Linked List Java Util \nSelect an opction: ");
		int opc = keyboard.nextInt();
		switch (opc) {
		case 1: {
			SinglyLinkedList lista = new SinglyLinkedList();
			int data;
			//////////////////////////// Insert //////////////////
			lista.insertFirst(93);
			lista.insertFirst(96);
			lista.insertFirst(13);
			lista.insertFirst(11);
			System.out.println(lista.getTam());
			System.out.println(lista.moveForward());
			
			System.out.println("What element do you want to insert at the beginning?: ");
			data = keyboard.nextInt();
			lista.insertFirst(data);
			System.out.println(lista.moveForward());
			
			
			System.out.println("\nWhat element do you want to insert at the end?: ");
			data = keyboard.nextInt();
			lista.insertLast(data);
			System.out.println(lista.moveForward());
			
			//////////////////////////// Search /////////////////
			System.out.println("\nWhat element do you want to search for?: ");
			data = keyboard.nextInt();
			if(lista.search(data)) {
				System.out.println("Found");
			}else {
				System.out.println("No found");
			}
			
			
			//////////////////////////// Remove /////////////////		
			System.out.println("\nWhat element do you want to remove?: ");
			data = keyboard.nextInt();
			
			if(!lista.remove(data)) {
				System.out.println("No found");
			}else {
				System.out.println("Deleted item");
			}
			System.out.println(lista.moveForward());
		
			
			System.out.println("\nFirst Item removed: " + lista.removeFirst());
			System.out.println(lista.moveForward());


			System.out.println("\nLast Item removed:" + lista.removeLast());
			System.out.println(lista.moveForward());
			break;
		}
		case 2: {
			DoublyLinkedList list = new DoublyLinkedList();
			
			//////////////////////////// Insert element /////////////////////////
			list.insertFirst(new Fraction(4, 6));
			list.insertFirst(new Fraction(5, 7));
			list.insertFirst(new Fraction(3, 2));	
			
			list.insertLast(new Fraction(4, 21));	
			System.out.println(list.sizeList());		
			System.out.println(list.moveForward());
			System.out.println(list.moveBackwards());
			
			
			
			//////////////////////////// Search element /////////////////////////	
			if(list.search(new Fraction(3, 24))) {
				System.out.println("\nFound\n");
			}else {
				System.out.println("\nNot found\n");
			}
			
			////////////////////////////Delete element //////////////////////////
			System.out.println("Deleted specific item: ");
			list.remove(new Fraction(5, 7));
			System.out.println(list.moveForward());
			System.out.println(list.sizeList());
			
			System.out.println("Deleted first item: " + list.removeFirst());
			System.out.println(list.moveForward());
			System.out.println(list.sizeList());
			
			System.out.println("Deleted last item: " + list.removeLast());
			System.out.println(list.moveForward());
			System.out.println(list.sizeList());
			break;
		}
		case 3: {
			
			CircularLinkedList list = new CircularLinkedList();
			
			//////////////////////////// Insert element /////////////////////////
			list.insertFirst(1);
			list.insertFirst(3);
			list.insertFirst(10);
			list.insertAtPosition(2, 6);
			list.insertAtPosition(5, 11);
			list.insertLast(5);	
			list.insertLast(8);
			list.insertLast(16);
			System.out.println("Size: " + list.sizeList());		
			System.out.println(list.moveForward());
			
			////////////////////////////Search element /////////////////////////
			System.out.print("Does the List contains '3'? : ");
			if(list.search(3)) {
				System.out.print("Yes\n");
			}else {
				System.out.print("No\n");
			}
			
			////////////////////////////Remove element /////////////////////////
			System.out.println("Deleted specific item: '6'");
			list.remove(6);
			System.out.println(list.moveForward());
			System.out.println(list.sizeList());
			
			System.out.println("Deleted first item: " + list.removeFirst());
			System.out.println("Deleted first item: " + list.removeFirst());
			System.out.println("Deleted first item: " + list.removeFirst());
			
			System.out.println("Deleted Last item: " + list.removeLast());
			System.out.println("Deleted Last item: " + list.removeLast());
			System.out.println(list.moveForward());
			break;
		}
		case 4: {
			LinkedListUseJavaUtil linkedListClass = new LinkedListUseJavaUtil();
			System.out.println("\nInsert: ");
			System.out.println(linkedListClass.insertElements());
			System.out.println("\nSize: " + linkedListClass.getAllElements().size());
			System.out.println("\nSearch: ");
			System.out.println("Does the List contains 'Josh': " + linkedListClass.search("Josh"));
			System.out.println("\nUpdate: ");
			System.out.println("Before: " + linkedListClass.getAllElements());
			System.out.println("Update value form inde '4': " + linkedListClass.update(4, "Charles"));
			System.out.println("\nRemove: ");
			System.out.println("Before: " + linkedListClass.getAllElements());
			System.out.println("After: " + linkedListClass.removeElements());
			System.out.println("\nIterar: ");
			linkedListClass.iterarElements();
			break;
		}
		default:
			System.out.println("Unexpected value: " + opc);
		}
		
	}

}
