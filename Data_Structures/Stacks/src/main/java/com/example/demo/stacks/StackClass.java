package com.example.demo.stacks;

public class StackClass<T> implements IStack<T> {

	private Node<T> tope; //we will indicate the type of data with the <T>
	
	public StackClass() {
		tope = null;
	}
	
	@Override
	public boolean empty() {
		return (tope == null) ? true : false;
	}

	@Override
	public T peek() {
		if(empty()) {
			return null;
		}
		return tope.data;
	}

	@Override
	public T pop() {
		if(!empty()) {
			T value = tope.data;
			tope = tope.next;
			return value;
		}
		return null;
	}

	@Override
	public T push(T element) {
		tope = new Node<T>(element, tope);
		return element;
	}

	@Override
	public void clear() {
		tope = null;		
	}

	@Override
	public boolean search(T element) {
		Node<T> temp = tope;
		while(temp != null) {
			if(temp.data == element) {
				return true;
			}else {
				temp = temp.next;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String cad = "{";
		Node<T> temp = tope;
		while(temp != null) {
			cad += temp.data + ",";
			temp = temp.next;
		}
		return cad + "}";
	}
	
	
	
}
