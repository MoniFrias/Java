package com.example.demo.circularLinkedList;

import com.example.demo.circularLinkedList.CircularLinkedList.Node;

public interface ICircularLinked {

	public void insertFirst(int dato);
	public int removeFirst();	
	public void insertAtPosition(int position, int value);
	public void insertLast(int dato);
	public int removeLast();	
	public boolean remove(int dato);
	public boolean search(int dato);
	public Node searchNode(int dato);
	public String moveForward();
	public boolean empty();
	public int sizeList();
}
