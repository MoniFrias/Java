package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionListApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionListApplication.class, args);
		
		Scanner keyboard = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println("\nSelect an opction: \n1. List with Arraylist \n2. List with Vector "
					+ "\n3. List with Stack \n4. List with LinkedList  \n5. Exit ");
			opc = keyboard.nextInt();
			ListClass list = new ListClass();
			switch (opc) {
			case 1: {
				list.listWithArrayList();
				break;
			}
			case 2: {
				list.listWithVector();
				break;	
					}
			case 3: {
				list.listWithStack();
				break;
			}
			case 4: {
				list.listWithLinkedList();
				break;
			}
			case 5: {
				opc = 5;
				break;
			}
			default:
				System.out.println("Unexpected value: " + opc);
			}			
		
		}while(opc != 5);
       
	}

}
