package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.searchClass.BinarySearch;
import com.example.demo.searchClass.ExponentialSearch;
import com.example.demo.searchClass.FibonacciSearch;
import com.example.demo.searchClass.JumpSearch;
import com.example.demo.searchClass.LinearSearch;
import com.example.demo.searchClass.SentinelSearch;
import com.example.demo.searchClass.TernarySearch;

@SpringBootApplication
public class SearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class, args);

		try (Scanner keyboard = new Scanner(System.in)) {
			int opc = 0;
			do {
				System.out.println("\nSelect an opction: \n1. Linear search \n2. Binary search "
						+ "\n3. Sentinel search \n4. Ternary search \n5. Jump search "
						+ "\n6. Exponential search \n7. Fibonacci search" + "\n8. Exit ");
				opc = keyboard.nextInt();
				switch (opc) {
				case 1: {
					System.out.println("-------------------- LINEAR SEARCH --------------------\n");
					LinearSearch ls = new LinearSearch();
					int arr[] = { 2, 3, 4, 10, 40 };
					int num1 = 10, num2 = 5;
					ls.searchMethod(arr, num1);
					ls.searchMethod(arr, num2);
					System.out.println("\n---------------------------------------------------------\n");
					break;
				}
				case 2: {
					System.out.println("-------------------- BINARY SEARCH --------------------\n");
					BinarySearch ls = new BinarySearch();
					int arr[] = { 2, 3, 4, 10, 40 };
					int num1 = 10, num2 = 5;
					ls.searchMethod(arr, num1);
					ls.searchMethod(arr, num2);
					System.out.println("\n---------------------------------------------------------\n");
					break;
				}
				case 3: {
					System.out.println("-------------------- SENTINEL SEARCH --------------------\n");
					SentinelSearch ss = new SentinelSearch();
					int arr[] = { 10, 20, 180, 30, 60, 50, 110, 100, 70 };
					int key = 18;
					ss.search(arr, key);
					System.out.println("\n---------------------------------------------------------\n");
					break;
				}
				case 4: {
					System.out.println("-------------------- TERNARY SEARCH --------------------\n");
					TernarySearch t = new TernarySearch();										
			        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			        int key = 5;
			        t.searchMethod(ar, key);
			        t.searchMethod(ar, 50);
			        System.out.println("\n---------------------------------------------------------\n");
			        break;
				}
				case 5: {
					System.out.println("-------------------- JUMP SEARCH --------------------\n");
					JumpSearch j = new JumpSearch();
					int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
					int num = 55;
					j.searchMethod(arr, num);
					j.searchMethod(arr, 2);
					System.out.println("\n---------------------------------------------------------\n");
					break;
				}
				case 6: {
					System.out.println("-------------------- EXPONENTIAL SEARCH --------------------\n");
					ExponentialSearch e = new ExponentialSearch();
					int arr[] = {2, 3, 4, 10, 40};
			        int num = 10;
			        e.searchMethod(arr, num);
			        e.searchMethod(arr, 1);
					System.out.println("\n---------------------------------------------------------\n");
					break;
				}
				case 7: {
					System.out.println("-------------------- FIBONACCI SEARCH --------------------\n");
					FibonacciSearch f = new FibonacciSearch();
					int arr[] = { 10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100,235};
					int num = 40;
					f.searchMethod(arr, num);
					System.out.println("\n---------------------------------------------------------\n");
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
