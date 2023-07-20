package com.example.demo.singlyLinkedList;

public interface ISinglyLinked {

	public void insertFirst(int dato);
	public int removeFirst();	
	public void insertLast(int dato);
	public int removeLast();	
	public boolean remove(int dato);
	public boolean search(int dato);
	public String moveForward();
	public boolean empty();
	public int sizeList();
}
