package com.example.demo.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArray{

	int[] arr = new int[3];
	Scanner keyboard = new Scanner(System.in);
	
	public void printValues(int  arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void array() {
		int arr[] = {3, 4, 5, 10, 11, 1, 34, 8};
		printValues(arr);
		System.out.println("\nSorted: ");
		Arrays.sort(arr);
		printValues(arr);
		
		System.out.println("\nNumero a buscar: ");
		int n = keyboard.nextInt();
		
		int result = Arrays.binarySearch(arr, n);
		if(result < 0) {
			System.out.println("No found");
		}else {
			System.out.println("\n" + n +" found at index = " + result);
		}
		
		System.out.println("\nReverse array");
		int reverseArray[] = new int[arr.length];
		int position = 0;
		for(int i = arr.length-1; i >= 0; i--) {
			reverseArray[position] = arr[i];
			position++;
		}
		printValues(reverseArray);
		
		System.out.println("\n\nClone");
		int arr2[] = arr; //apunta a la misma direccion
		System.out.println("arr2: " + arr2 + "\narr: " + arr);
		arr2 = arr.clone(); //pasa los valores, distinta direccion de memoria
		System.out.println("\narr2: " + arr2[1] + "\narr: " + arr[1]);
	}
}
