package com.example.demo;

public class MinHeapClass {

	int[] heap; // Array when the elements are saved
	int size; // Number of Heap Items

	// Constructor to create empty heap
	public MinHeapClass(int maxsize) {
		this.size = 0;
		heap = new int[maxsize];
	}

	// Constructor to create a heap based on an array of numbers
	public MinHeapClass(int[] arr) {
		this.size = arr.length;
		heap = arr;
		buildHeap();
	}

	// returns the number of elements that the Min-Heap has
	public int size() {
		return size;
	}

	public int[] getHeap() {
		return heap;
	}

	public void insert(int dato) {
		if (size == heap.length) {
			System.out.println("MinHeap is full");
		} else { // there is space for an element
			int currentPos = size;
			heap[currentPos] = dato; // element is inserted into the array
			size++; // increment counter
			while (heap[currentPos] < heap[parent(currentPos)]) {
				// if the new value is smaller than the
				// parent in current position needs swap
				swap(currentPos, parent(currentPos));// swap positions
				currentPos = parent(currentPos);
			}
		}
	}

	public void buildHeap() {
		for (int i = size / 2; i >= 0; i--) {
			heapify(i, size - 1);
		}
	}

	public void printArray() {
		for (int i = 0; i < heap.length; i++) {
			System.out.print(heap[i] + " | ");
		}
		System.out.println();
	}

	public void printTree() {
		for (int i = 0; i < size / 2; i++) {
			System.out.print(" Parent: " + heap[i] + " Left child: " + heap[leftChild(i)] + " Right child: "
					+ heap[rightChild(i)]);
			System.out.println("");
		}
	}

	public void heapSort() {
		for (int i = heap.length - 1; i > 0; i--) {
			swap(0, i);
			heapify(0, i - 1);
		}
	}

	public int getMin() {
		return heap[0];
	}

	public int extractMin() {
		if (heap.length == 0) {
			System.out.println("MinHeap empty");
		} else if (heap.length == 1) {
			int min = heap[0];
			heap[0] = 0;
			size--;
			return min;
		}
		int min = heap[0];
		heap[0] = heap[size - 1];
		heap[size - 1] = 0;
		size--;

		heapify(0, size - 1);
		return min;
	}

	// Check that the left child of position i is a value less than or equal to j
	private void heapify(int i, int j) {
		int k; // stores the position of the value that has to go up
		if ((leftChild(i)) <= j) {
			if ((rightChild(i)) <= j) {
				k = (heap[rightChild(i)] <= heap[leftChild(i)]) ? rightChild(i) : leftChild(i);
			} else {
				k = leftChild(i);
			}
			if (heap[i] > heap[k]) {
				swap(i, k);
				heapify(k, j);
			}
		}
	}

	private void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

	private int parent(int pos) {
		return ((pos - 1) / 2);
	}

	private int leftChild(int pos) {
		return ((2 * pos) + 1);
	}

	private int rightChild(int pos) {
		return ((2 * pos) + 2);
	}

}
