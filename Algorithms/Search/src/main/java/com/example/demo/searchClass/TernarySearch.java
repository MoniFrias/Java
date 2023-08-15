package com.example.demo.searchClass;

public class TernarySearch {

	public void searchMethod(int arr[], int num) {
		int l = 0;
		int r = 9;
		int result = search(l, r, num, arr);
		System.out.println((result >= 0) ? "Number " + num + " is present at index: " + result
				: "Number " + num + " is not present");
	}

	public int search(int l, int r, int key, int ar[]) {

		if (r >= l) {
			int mid1 = l + (r - l) / 3;
			int mid2 = r - (r - l) / 3;

			if (ar[mid1] == key) {
				return mid1;
			}
			if (ar[mid2] == key) {
				return mid2;
			}

			if (key < ar[mid1]) {
				return search(l, mid1 - 1, key, ar);
			} else if (key > ar[mid2]) {
				return search(mid2 + 1, r, key, ar);
			} else {
				return search(mid1 + 1, mid2 - 1, key, ar);
			}
		}
		return -1;
	}

}
