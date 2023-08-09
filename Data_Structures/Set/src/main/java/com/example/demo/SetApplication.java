package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetApplication.class, args);
		
		Scanner keyboard = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println("\nSelect an opction: \n1. Set HashSet \n2. Set EnumSet \n3. LinkedHashSet \n4. TreeSet \n5. Exit ");
			opc = keyboard.nextInt();
			SetClass s = new SetClass();
			switch (opc) {
			case 1: {
				s.hashSetMethod();
				break;
			}
			case 2: {
				s.enumSetMethod();
				break;	
					}
			case 3: {
				s.linkedHashSetMethod();
				break;
			}
			case 4: {
				s.treeSetMethod();
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
