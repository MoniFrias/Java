package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionMapApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionMapApplication.class, args);
		
		Scanner keyboard = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println("\nSelect an opction: \n1. Map HashMap \n2. Map LinkedHashMap \n3. Map TreeMap \n4. Exit ");
			opc = keyboard.nextInt();
			MapClass m = new MapClass();
			switch (opc) {
			case 1: {
				m.hashMapMethod();
				break;
			}
			case 2: {
				m.linkedHashMapMethod();
				break;	
					}
			case 3: {
				m.treeMapMethod();
				break;
			}
			case 4: {
				opc = 4;
				break;
			}
			default:
				System.out.println("Unexpected value: " + opc);
			}			
		
		}while(opc != 4);
	}

}
