package com.example.demo.doublyLinkedList;

import java.util.Objects;

public class DoublyLinkedList implements IDoublyLinked{
	private Nodo head;
	private Nodo fin;
	private int tam;
	
	
	public DoublyLinkedList() {
		this.head = null;
		this.fin = null;
		this.tam = 0;
	}


	@Override
	public void insertFirst(Fraction dato) {
		head = new Nodo(dato, head);		
		if(tam == 0) {
			fin = head; // is the first node
		}else {
			head.next.prev = head;
		}
		tam++;
		
	}

	@Override
	public Fraction removeFirst() {
		if(!empty()) {
			Fraction value = head.dato;
			head = head.next; // advance start
			if(Objects.isNull(head)) {
				// there was one node
				fin = null;
			}else {
				// there were more nodes
				head.prev = null;
			}
			tam--;
			return value;			
		}
		return null;
	}

	@Override
	public void insertLast(Fraction dato) {
		if(empty()) {
			insertFirst(null);
		}else {
			fin.next = new Nodo(fin, dato);
			fin = fin.next;
			tam++;	
		}			
	}

	@Override
	public Fraction removeLast() {
		if(!empty()) {
			Fraction value = fin.dato;
			fin = fin.prev; // 
			if(Objects.isNull(fin)) {
				// there was one node
				head = null;
			}else {
				// there are 2 or more nodes
				fin.next = null;
			}
			tam--;
			return value;			
		}
		return null;
	}

	@Override
	public boolean remove(Fraction dato) {
		Nodo temp = searchNode(dato);
		if(Objects.isNull(temp)) {
			return false; // Node does not exist
		}else {
			if(Objects.isNull(temp.prev)) { // when it is the first element to be removed
				removeFirst();
			}else if(Objects.isNull(temp.next)){// if the node is at the end
				removeLast(); 
			}else { // is between two nodes
				//the node is removed by the garbage collection
				temp.next.prev = temp.prev; // we define new connections
				temp.prev.next = temp.next; // we define new connections
				tam--;
			}
			return true;
			
		}
	}

	@Override
	public boolean search(Fraction dato) {
		Nodo temp = head;
		while(Objects.nonNull(temp)) {
			if(temp.dato.equals(dato)) {
				return true;
			}else {
				temp = temp.next;
			}
		}
		return false;
	}
	
	private Nodo searchNode(Fraction dato) {
		Nodo temp = head;
		while (Objects.nonNull(temp)) {
			if(temp.dato.equals(dato)) {
				return temp;
			}else {			
				temp = temp.next;
			}
		}
		return null;//Null because Node does not exist
	}

	@Override
	public String moveForward() {
		Nodo temp = head;
		String cad = "";
		while(Objects.nonNull(temp)) {
			cad += temp.dato + ",";
			temp = temp.next; // advance it to the next
		}
		return cad;
	}
	
	@Override
	public String moveBackwards() {
		Nodo temp = fin;
		String cad = "";
		while(Objects.nonNull(temp)) {
			cad += temp.dato + ",";
			temp = temp.prev; // advance it to the next
		}
		return cad;
	}

	@Override
	public boolean empty() {
		return (this.head == null) ? true : false;
	}

	@Override
	public int sizeList() {
		return tam;
	}
	
	
	
	private class Nodo{
		Fraction dato;
		Nodo prev;
		Nodo next;
		
		public Nodo(Fraction dato, Nodo next) {
			this.prev = null;
			this.dato = dato;
			this.next = next;
		}
		
		public Nodo(Nodo prev, Fraction dato) {
			this.prev = prev;
			this.dato = dato;
			this.next = null;
		}
		
	}
}
