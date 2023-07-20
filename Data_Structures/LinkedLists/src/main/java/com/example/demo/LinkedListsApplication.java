package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.doublyLinkedList.DoublyLinkedList;
import com.example.demo.doublyLinkedList.Fraction;
import com.example.demo.singlyLinkedList.SinglyLinkedList;

@SpringBootApplication
public class LinkedListsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkedListsApplication.class, args);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1. Singly Linked List\n2. Doubly Linked List\n3. Circular Linked List"
				+ "\nSelect an opction: ");
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
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opc);
		}
		
	}

}
