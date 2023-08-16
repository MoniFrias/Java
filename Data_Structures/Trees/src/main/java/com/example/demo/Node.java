package com.example.demo;

public class Node {

	int value;
	Node left, right, parent;

	public Node(int value) {
		this.value = value;
		left = null;
		right = null;
		parent = null;
	}

	public Node(int value, Node parent) {
		this.value = value;
		left = null;
		right = null;
		this.parent = parent;
	}
}
