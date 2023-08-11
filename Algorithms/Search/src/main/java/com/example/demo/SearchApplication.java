package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.searchClass.BinarySearch;
import com.example.demo.searchClass.LinearSearch;

@SpringBootApplication
public class SearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class, args);
		
		try (Scanner keyboard = new Scanner(System.in)) {
			int opc = 0;
			do {
				System.out.println("\nSelect an opction: \n1. Linear search \n2. Binary search "
						+ "\n3. Sentinel search \n4. Ternary search \n5. Jump search "
						+ "\n6. Exponential search \n7. Fibonacci search"
						+ "\n8. Exit ");
				opc = keyboard.nextInt();
				switch (opc) {
				case 1: {
					System.out.println("-------------------- LINEAR SEARCH --------------------\n");
					LinearSearch ls = new LinearSearch();
					int arr[] = { 2, 3, 4, 10, 40 };
					int num1 = 10, num2 = 5;
					ls.searchMethod(arr, num1);
					ls.searchMethod(arr, num2);
					break;
				}
				case 2: {
					System.out.println("-------------------- BINARY SEARCH --------------------\n");
					BinarySearch ls = new BinarySearch();
					int arr[] = { 2, 3, 4, 10, 40 };
					int num1 = 10, num2 = 5;
					ls.searchMethod(arr, num1);
					ls.searchMethod(arr, num2);
					break;
				}
				case 3: {
					System.out.println("-------------------- SENTINEL SEARCH --------------------\n");
					break;
				}
				case 4: {
					System.out.println("-------------------- TERNARY SEARCH --------------------\n");
					break;
				}
				case 5: {
					System.out.println("-------------------- JUMP SEARCH --------------------\n");
					break;
				}
				case 6: {
					System.out.println("-------------------- EXPONENTIAL SEARCH --------------------\n");
					break;
				}
				case 7: {
					System.out.println("-------------------- FIBONACCI SEARCH --------------------\n");
					break;
				}
				case 8: {
					opc = 8;
					break;
				}
				default:
					System.out.println("Unexpected value: " + opc);
				}

			} while (opc != 8);
		}
	}

}
