package com.example.demo.singlyLinkedList;

import java.util.Objects;

public class SinglyLinkedList implements ISinglyLinked{

	private Nodo head;
	private Nodo fin;
	private int tam;
	
	public SinglyLinkedList() {
		head = null; //at start no list has been created so it is null
		fin = null;
		tam = 0;
	}
	
	public int getTam() {
		return tam;
	}

	@Override
	public void insertFirst(int dato) {
		head = new Nodo(dato, head);
		if(tam == 0) {
			fin = head; 
		}
		tam++;
	}	

	@Override
	public int removeFirst() {
		if(!empty()) {
			int value = head.dato; // get data to delete before moving forward
			head = head.next;
			tam --;
			if(tam == 0) {
				fin = null; 
			}
			return value;
		}
		return -1;
	}
	
	@Override
	public void insertLast(int dato) {		
		if(empty()) {
			insertFirst(dato);
		}else {
			fin.next = new Nodo(dato);
			fin = fin.next; // move it to the last node
		}
	}	
	
	@Override
	public int removeLast() {
		Nodo previousToLastNode  = null;
		Nodo lastNode = head;		
		int value = 0;
		if(!empty()) {
			while(Objects.nonNull(lastNode.next)) {
				previousToLastNode = lastNode;
				lastNode = lastNode.next;
			}
			if(tam > 1) {
				previousToLastNode.next = null;
				tam --;
				return lastNode.dato;
			}else {
				value = head.dato;
				head = null;
				tam = 0;
				return value;
			}		
		}
		return -1;
	}
	
	@Override
	public boolean remove(int dato) {
		Nodo[] res = searchNode(dato);
		if(Objects.isNull(res)) {
			return false;
		}else {
			if(Objects.isNull(res[0])) { //when is element 1 to be removed since prev is null
				removeFirst();
			}else {
				res[0].next = res[1].next;
				tam--;
			}
			return true;
			
		}
	}

	@Override
	public boolean search(int dato) {
		Nodo temp = head;
		while (Objects.nonNull(temp)) {
			if(temp.dato == dato) {
				return true;
			}else {			
			temp = temp.next;
			}
		}
		return false;
	}
	
	private Nodo[] searchNode(int dato) {
		
		Nodo prevTemp = null;
		Nodo temp = head;
		while (Objects.nonNull(temp)) {
			if(temp.dato == dato) {
				Nodo[] res = new Nodo[2];
				res[0] = prevTemp;
				res[1] = temp;
				return res;
			}else {			
				prevTemp = temp;
				temp = temp.next;
			}
		}
		return null;//null because it doesn't exist
	}

	@Override
	public String moveForward() {
		String cad = "{";
		Nodo temp = head;
		while (Objects.nonNull(temp)) {
			cad += temp.dato + ", ";
			temp = temp.next;
		}
		
		return cad + "}";
	}

	@Override
	public boolean empty() {
		return (head == null) ? true : false;
	}

	@Override
	public int sizeList() {
		return tam;
	}
	
	///////////////////// inner nested class //////////////////
	private class Nodo { //private to only be used within this LinkedList class

		//create a node
		int dato;
		Nodo next;
		
		public Nodo(int dato) {
			this.dato = dato;
			next = null;
		}
		
		public Nodo(int dato, Nodo next) {
			this.dato = dato;
			this.next = next;
		}
	}
}
