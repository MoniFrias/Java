package com.example.demo.searchClass;

public class LinearSearch {
	
	public void searchMethod(int arr[], int num) {
		int result = search(arr, num);
		if(result >= 0) {
			System.out.println("Number " + num + " is present at index: " + result);
		}else {
			System.out.println("Number " + num + " is not present");
		}
	}

	public int search(int arr[], int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			} 
		}
		return -1;
	}
	
}
