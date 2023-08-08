package com.example.demo.queueClass;

public class QueueClass implements IQueue{
	
	Node front, rear;
	String queue = "";
	
	public QueueClass() {
		this.front = null;
		this.rear = null;
	}

	@Override
	public void enqueue(int value) {
		Node temp = new Node(value);	
		if(isEmpty()) {
			front = temp;
			rear = temp;
		}else {
			rear.next = temp;
			rear = temp;
		}
	}

	@Override
	public int dequeue() {
		if(!isEmpty()) {
			int value = front.data;
			if(front == rear) {
				front = null;
				rear = null;
			}else {
				front = front.next;
			}
			return value;
		}else {
			return -1;
		}
		
	}

	@Override
	public boolean isEmpty() {
		return (front == null) ? true : false;
	}
	
	@Override
	public void  getQueue() {
		Node temp = front;
		String queueInvert = "";
		while(temp != null) {
			queue += temp.data + " ";
			temp = temp.next;
		}
		
		String cad[] = queue.split(" ");
		for(int i = cad.length - 1; i >= 0; i--) {
			queueInvert += " " + cad[i];
		}
		System.out.print(queueInvert);
		queue = "";
	}

}
