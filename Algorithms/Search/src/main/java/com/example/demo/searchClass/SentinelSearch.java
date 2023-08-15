package com.example.demo.searchClass;

public class SentinelSearch {

	public void search(int arr[], int num) {
		int n = arr.length;
		int last = arr[n - 1];

		arr[n - 1] = num;
		int i = 0;

		while (arr[i] != num)
			i++;

		arr[n - 1] = last;

		if ((i < n - 1) || (arr[n - 1] == num)) {
			System.out.println(num + " is present at index " + i);
		} else {
			System.out.println("Element Not found");
		}

	}
}
