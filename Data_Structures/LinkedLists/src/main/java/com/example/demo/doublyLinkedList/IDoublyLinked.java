package com.example.demo.doublyLinkedList;

public interface IDoublyLinked {
	
	public void insertFirst(Fraction dato);
	public Fraction removeFirst();	
	public void insertLast(Fraction dato);
	public Fraction removeLast();	
	public boolean remove(Fraction dato);
	public boolean search(Fraction dato);
	public String moveForward();
	public String moveBackwards();
	public boolean empty();
	public int sizeList();
}
