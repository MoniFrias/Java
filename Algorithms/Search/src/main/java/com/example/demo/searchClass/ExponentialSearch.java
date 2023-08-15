package com.example.demo.searchClass;

import java.util.Arrays;

public class ExponentialSearch {

	public void searchMethod(int arr[], int num) {
		int result = exponentialSearch(arr, num);
		System.out.println((result >= 0) ? "Number " + num + " is present at index: " + result
				: "Number " + num + " is not present");
	}

	public int exponentialSearch(int arr[], int num) {
		int n = arr.length;
		if (arr[0] == num)
			return 0;

		int i = 1;
		while (i < n && arr[i] <= num) {
			i = i * 2;
		}
		return Arrays.binarySearch(arr, i / 2, Math.min(i, n - 1), num);
	}

}
