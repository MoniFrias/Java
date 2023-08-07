package com.example.demo.stacks;

public interface IStack<T> {

	boolean empty();
	T peek();
	T pop();
	T push(T element);
	void clear();
	boolean search(T element);
}
