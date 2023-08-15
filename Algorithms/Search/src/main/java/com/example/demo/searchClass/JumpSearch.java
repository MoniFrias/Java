package com.example.demo.searchClass;

public class JumpSearch {

	public void searchMethod(int arr[], int num) {
		int result = jumpSearch(arr, num);
		System.out.println((result >= 0) ? "Number " + num + " is present at index: " + result
				: "Number " + num + " is not present");

	}

	public int jumpSearch(int[] arr, int num) {
		int n = arr.length;
		int prev = 0;
		int step = (int) Math.floor(Math.sqrt(n));

		for (int minStep = Math.min(step, n) - 1; arr[minStep] < num; minStep = Math.min(step, n) - 1) {
			prev = step;
			step += (int) Math.floor(Math.sqrt(n));
			if (prev >= n)
				return -1;
		}

		while (arr[prev] < num) {
			prev++;

			if (prev == Math.min(step, n))
				return -1;
		}

		if (arr[prev] == num)
			return prev;

		return -1;

	}

}
