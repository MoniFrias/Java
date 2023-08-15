package com.example.demo.searchClass;

public class FibonacciSearch {

	public void searchMethod(int arr[], int num) {
		int result = fibonaccianSearch(arr, num);
		System.out.println((result >= 0) ? "Number " + num + " is present at index: " + result
				: "Number " + num + " is not present");
	}

	public static int min(int x, int y) {
		return (x <= y) ? x : y;
	}

	public static int fibonaccianSearch(int arr[], int num) {
		int n = arr.length;
		int fibMMm2 = 0; // (m-2)th Fibonacci No.
		int fibMMm1 = 1; // (m-1)th Fibonacci No.
		int fibM = fibMMm2 + fibMMm1; // m th Fibonacci

		while (fibM < n) {
			fibMMm2 = fibMMm1;
			fibMMm1 = fibM;
			fibM = fibMMm2 + fibMMm1;
		}

		int offset = -1;

		while (fibM > 1) {
			int i = min(offset + fibMMm2, n - 1);
			if (arr[i] < num) {
				fibM = fibMMm1;
				fibMMm1 = fibMMm2;
				fibMMm2 = fibM - fibMMm1;
				offset = i;
			} else if (arr[i] > num) {
				fibM = fibMMm2;
				fibMMm1 = fibMMm1 - fibMMm2;
				fibMMm2 = fibM - fibMMm1;
			} else {
				return i;
			}
		}

		if (fibMMm1 == 1 && arr[n - 1] == num) {
			return n - 1;
		} else {
			return -1;
		}
	}

}
