package com.example.demo;

public class MaxHeapClass {

	int[] heap;
	int size;

	public MaxHeapClass(int maxsize) {
		this.size = 0;
		heap = new int[maxsize];
	}

	public MaxHeapClass(int[] arr) {
		this.size = arr.length;
		heap = arr;
		buildHeap();
	}

	public int size() {
		return size;
	}

	public int[] getHeap() {
		return heap;
	}

	public void insert(int dato) {
		if (size == heap.length) {
			System.out.println("MaxHeap is full");
		} else {
			int currentPos = size;
			heap[currentPos] = dato;
			size++;
			while (heap[currentPos] > heap[parent(currentPos)]) {
				swap(currentPos, parent(currentPos));
				currentPos = parent(currentPos);

			}
		}
	}

	public void buildHeap() {
		for (int i = size / 2; i >= 0; i--) {
			heapify(i, size - 1);
		}
	}

	public int getMax() {
		return heap[0];
	}

	public void heapSort() {
		for (int i = heap.length - 1; i > 0; i--) {
			swap(0, i);
			heapify(0, i - 1);
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

	private void heapify(int i, int j) {
		int k;
		if ((leftChild(i)) <= j) {
			if ((rightChild(i)) <= j) {
				k = (heap[rightChild(i)] >= heap[leftChild(i)]) ? rightChild(i) : leftChild(i);
			} else {
				k = leftChild(i);
			}
			if (heap[i] < heap[k]) {
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
