package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TreesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreesApplication.class, args);

		try (Scanner keyboard = new Scanner(System.in)) {
			TreeClass bst = new TreeClass();
			int opc = 0;
			do {
				System.out.println("\nSelect an opction: \n1. Insert \n2. Search an element"
						+ "\n3. Traverse the tree \n4. Delete an element \n5. Exit ");
				opc = keyboard.nextInt();

				switch (opc) {
				case 1: {
					System.out.println("-------------------- INSERT --------------------\n");
					bst.insert(15);
					bst.insert(9);
					bst.insert(20);
					bst.insert(6);
					bst.insert(14);
					bst.insert(17);
					bst.insert(64);
					bst.insert(13);
					bst.insert(26);
					bst.insert(72);
					System.out.println("\nInserted correctly\n");
					System.out.println("\n----------------------------------------------\n");
					break;
				}
				case 2: {
					System.out.println("-------------------- SEARCH --------------------\n");
					System.out.println("Is number 39 in the tree? " + bst.search(39));
					System.out.println("Is number 17 in the tree? " + bst.search(17));
					System.out.println("Is number 72 in the tree? " + bst.search(72));
					System.out.println("Is number 11 in the tree? " + bst.search(11));
					System.out.println("\n----------------------------------------------\n");
					break;
				}
				case 3: {
					System.out.println("-------------------- TRAVERSE --------------------\n");
					System.out.println("In-orden\n" + bst.inorden());
					System.out.println("Pre-orden");
					bst.preorden();
					System.out.println("\nPost-orden");
					bst.postorden();
					System.out.println("\n------------------------------------------------\n");
					break;
				}
				case 4: {
					System.out.println("-------------------- DELETE --------------------\n");
					System.out.println("In-orden after deleted some numbers:\n" + bst.inorden());
					bst.delete(14);
					System.out.println(bst.inorden());
					bst.delete(26);
					System.out.println(bst.inorden());
					bst.delete(15);
					System.out.println(bst.inorden());
					System.out.println("\n----------------------------------------------\n");
					break;
				}
				case 5: {
					opc = 5;
					break;
				}
				default:
					System.out.println("Unexpected value: " + opc);
				}

			} while (opc != 5);

		}
	}
}
