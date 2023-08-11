package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HeapApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeapApplication.class, args);
		
		Scanner keyboard = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println("\nSelect an opction: \n1. MinHeap \n2. MaxHeap \n3. Exit ");
			opc = keyboard.nextInt();			
			switch (opc) {
			case 1: {
				MinHeapClass h = new MinHeapClass(7);
				System.out.println("-------------------- MINHEAP --------------------\n");
				System.out.println("** Heap is empty and the elements are added one by one **\n");
				h.insert(30);
				h.insert(48);
				h.insert(15);
				h.insert(67);
				h.insert(24);
				h.insert(17);
				h.insert(5);
				
				System.out.println("\nPrint Tree:\n");
				h.printTree();
				System.out.println("\nPrint Array:\n");
				h.printArray();
				
				int arr[] = {30, 48, 15, 67, 24, 17, 5};
				MinHeapClass h2 = new MinHeapClass(arr);
				
				System.out.println("\n** Array is already full and the heap is built **\n");
				System.out.println("\nPrint Tree:\n");
				h2.printTree();
				System.out.println("\nPrint Array:\n");
				h2.printArray();
				
				h2.heapSort();
				System.out.println("\nPrint Array heapSort:\n");
				h2.printArray();
				break;
			}
			case 2: {
				MaxHeapClass h = new MaxHeapClass(7);
				System.out.println("-------------------- MAXHEAP --------------------\n");
				System.out.println("** Heap is empty and the elements are added one by one **\n");
				h.insert(30);
				h.insert(48);
				h.insert(15);
				h.insert(67);
				h.insert(24);
				h.insert(17);
				h.insert(5);
				
				System.out.println("\nPrint Tree:\n");
				h.printTree();
				System.out.println("\nPrint Array:\n");
				h.printArray();
				
				int arr[] = {30, 48, 15, 67, 24, 17, 5};
				MaxHeapClass h2 = new MaxHeapClass(arr);
				
				System.out.println("\n** Array is already full and the heap is built **\n");
				System.out.println("\nPrint Tree:\n");
				h2.printTree();
				System.out.println("\nPrint Array:\n");
				h2.printArray();
				
				h2.heapSort();
				System.out.println("\nPrint Array heapSort:\n");
				h2.printArray();				
				break;	
			}			
			case 3: {
				opc = 3;
				break;
			}
			default:
				System.out.println("Unexpected value: " + opc);
			}			
		
		}while(opc != 3);
	}

}
