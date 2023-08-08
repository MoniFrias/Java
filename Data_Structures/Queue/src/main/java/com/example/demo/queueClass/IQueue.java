package com.example.demo.queueClass;

public interface IQueue {

	void enqueue(int value);
	int dequeue();
	boolean isEmpty();
	void getQueue();
}
