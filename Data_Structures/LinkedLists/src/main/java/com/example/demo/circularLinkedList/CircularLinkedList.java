package com.example.demo.circularLinkedList;

import java.util.Objects;

public class CircularLinkedList implements ICircularLinked{

	private Node head;
	private Node tail;
	private int tam;
	
	public CircularLinkedList() {
		this.head = null;
		this.tail = null;
		this.tam = 0;
	}

	@Override
	public void insertFirst(int value) {
		Node newNode = new Node(value);
		 
	    if (Objects.isNull(head)) { // is empty
	        head = newNode;
	        tail = newNode;
	        tail.next = head;
	    } else {
	       tail.next = newNode;
	       newNode.next = head ;
	       head = newNode;
	    }
		tam++;
	}
	
	public void insertAtPosition(int position, int value) {
		Node newNode = new Node(value);
		if (position < 1 || position > sizeList() + 1) {
		    System.out.println("Invalid position!");
		    return;
		  }
		 
		  if (position == 1) {
		    insertFirst(value);
		  } else if (position == sizeList() + 1) {
			  insertLast(value);
		  } else {
		    Node current = head;
		    for (int i = 1; i < position - 1; i++) {
		      current = current.next;
		    }
		    newNode.next = current.next;
		    current.next = newNode;		    
		    tam++;
		  }
		  
	}

	@Override
	public int removeFirst() {	
		if(!empty()) {
			int value = head.value;
			if(tail == head) {//only one node
				head = null;
				tail =  null;
			}else {
				head = head.next;
				tail.next = head;				
			}
			return value;
		}
		return -1;
	}

	@Override
	public void insertLast(int value) {
		Node newNode = new Node(value);
	    if (empty()) {
	        insertFirst(value);
	    } else {	        
	        newNode.next = tail.next;
	        tail.next = newNode;
	        tail = newNode;
	        tam++;
	    }
	    
	}
	
	@Override
	public int removeLast() {
		Node current = head, prev = null;
		if(!empty()) {
			int value = tail.value;
			if(tail == head) {//only one node
				head = null;
				tail =  null;
			}else {				
				while(current.next != head) {
					prev = current;
					current = current.next;
				}
				tail = prev;
				tail.next = head;				
			}
			return value;
		}
		return -1;
	}

	@Override
	public boolean remove(int dato) {
		Node temp = searchNode(dato);
		Node current = head, prev = null;
		if(Objects.isNull(temp)) {
			return false; // Node does  not exist
		}else {
			while(current.next.value == dato) {
				prev = current;
				current = current.next;
			}
			
			if(prev == null) {
				removeFirst();
			}else {
				prev.next = current.next;
				tam--;
			}
			return true;
			
		}
	}

	@Override
	public boolean search(int dato) {
		Node temp = head;
		if (Objects.nonNull(temp)) {
			do {
				if(temp.value == dato) {
					return true;
				}else {			
				temp = temp.next;
				}
			}while(temp != head);
		}
		return false;
	}
	
	@Override
	public Node searchNode(int dato) {
		Node temp = head;
		if (Objects.nonNull(temp)) {
			do {
				if(temp.value == dato) {
					return temp;
				}else {			
					temp = temp.next;
				}
			}while(temp != head);
		}
		return null;//Null because Node does not exist
	}

	@Override
	public String moveForward() {
		String cad = "{";
		Node temp = head;
		if (Objects.nonNull(head)) {
			do {
				cad += temp.value + ", ";
				temp = temp.next;
			}while(temp != head);
		}
		
		return cad + "}";
	}

	@Override
	public boolean empty() {
		return (Objects.isNull(this.head)) ? true : false;
	}

	@Override
	public int sizeList() {
		return tam;
	}
	
	
	
	class Node {
	    int value;
	    Node next;
	 
	    public Node(int value) {
	        this.value = value;
	    }

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}
