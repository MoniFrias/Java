package com.example.demo.searchClass;

public class LinearSearch {

	public void searchMethod(int arr[], int num) {
		int result = search(arr, num);
		System.out.println((result >= 0) ? "Number " + num + " is present at index: " + result
				: "Number " + num + " is not present");
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
