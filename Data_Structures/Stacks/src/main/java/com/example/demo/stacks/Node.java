package com.example.demo.stacks;

public class Node<T> {
	//<T> is to specify the data type to use different
	
	T data;
	Node<T> next;
	
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
	
}
