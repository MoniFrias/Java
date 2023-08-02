package com.example.demo;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.arrays.OneDimensionalArray;
import com.example.demo.arrays.TwoDimensionalArray;

@SpringBootApplication
public class ArraysApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArraysApplication.class, args);
		Logger logger
        = LogManager.getLogger(ArraysApplication.class);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1. One dimensional array\n2. Two dimensional array\nSelect an opction: ");
		int opc = keyboard.nextInt();
		switch (opc) {
		case 1: {
			System.out.println("\nOne dimensional array");
			OneDimensionalArray arr = new OneDimensionalArray();
			arr.array();		
			
			break;
		}
		case 2: {
			System.out.println("\nTwo dimensional array");
			TwoDimensionalArray arr = new TwoDimensionalArray();
			arr.array();
			break;
		}
		default:
			System.out.println("Unexpected value: " + opc);
		}
	}

}
