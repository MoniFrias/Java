package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.sortingClass.BubbleSort;
import com.example.demo.sortingClass.InsertionSort;
import com.example.demo.sortingClass.MergeSort;
import com.example.demo.sortingClass.QuickSort;
import com.example.demo.sortingClass.SelectionSort;

@SpringBootApplication
public class SortApplication {

	public static void main(String[] args) {
		SpringApplication.run(SortApplication.class, args);
		
		try (Scanner keyboard = new Scanner(System.in)) {
			int opc = 0;
			do {
				System.out.println("\nSelect an opction: \n1. Bubble sort \n2. Selection sort "
						+ "\n3. Insertion sort \n4. Merge sort \n5. Quick sort \n6. Exit ");
				opc = keyboard.nextInt();
				switch (opc) {
				case 1: {
					System.out.println("-------------------- BUBBLE SORT --------------------\n");
					BubbleSort bs = new BubbleSort();
					int arr[] = { 64, 34, 25, 12, 22, 11, 90 };					
					bs.bubbleSort(arr);
					bs.printArray(arr);
					System.out.println("\n---------------------------------------------------\n");
					break;
				}
				case 2: {
					System.out.println("-------------------- SELECTION SORT --------------------\n");
					SelectionSort ss = new SelectionSort();
					int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
					ss.selectionSort(arr);
					ss.printArray(arr);					
					System.out.println("\n------------------------------------------------------\n");
					break;
				}
				case 3: {
					System.out.println("-------------------- INSERTION SORT --------------------\n");
					InsertionSort is = new InsertionSort();
					int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
					is.insertionSort(arr);
					is.printArray(arr);		
					System.out.println("\n------------------------------------------------------\n");
					break;
				}
				case 4: {
					System.out.println("-------------------- MERGE SORT --------------------\n");
					MergeSort ms = new MergeSort();										
					int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
					int r =arr.length - 1;
					ms.mergeSort(arr, 0 , r);
					ms.printArray(arr);	
			        System.out.println("\n--------------------------------------------------\n");
			        break;
				}
				case 5: {
					System.out.println("-------------------- QUICK SORT --------------------\n");
					QuickSort qs = new QuickSort();										
					int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
					int r =arr.length - 1;
					qs.quickSort(arr, 0, r);
					qs.printArray(arr);	
			        System.out.println("\n--------------------------------------------------\n");
			        break;
				}				
				case 6: {
					opc = 6;
					break;
				}
				default:
					System.out.println("Unexpected value: " + opc);
				}

			} while (opc != 6);
		}
	}

}
