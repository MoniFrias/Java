package com.example.demo.searchClass;

public class BinarySearch {

	public void searchMethod(int arr[], int num) {
		int result = search(arr, num);
		if(result >= 0) {
			System.out.println("Number " + num + " is present at index: " + result);
		}else {
			System.out.println("Number " + num + " is not present");
		}
	}

	public int search(int arr[], int num) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int middle = low + (high - low) / 2;
			if (arr[middle] == num) {
				return middle;
			}
			if(arr[middle] < num) {
				low = middle + 1;
			}else {
				high = middle - 1;
			}
		}
		return -1;
	}
}
