package com.example.demo.arrays;

import java.util.Scanner;

public class TwoDimensionalArray {
	
	
	Scanner keyboard = new Scanner(System.in);
	int rows = 2, columns = 2;
	int[][] arr = new int[rows][columns];
	
	public void array() {       
        
		//Add values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
        
        printfArray(arr);          
        
	}
	
	public void printfArray(int array[][]) {
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
