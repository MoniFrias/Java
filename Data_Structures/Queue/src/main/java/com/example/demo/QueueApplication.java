package com.example.demo;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.queueClass.QueueClass;

@SpringBootApplication
public class QueueApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueueApplication.class, args);

		Scanner keyboard = new Scanner(System.in);
		System.out.println(
				"1. Queue\n2. Queue with java.utils \n3. ArrayDeque with java.utils \n4. Priority Queue with java.utils \nSelect an opction: ");
		int opc = keyboard.nextInt();

		switch (opc) {
		case 1: {
			QueueClass queue = new QueueClass();
			queue.enqueue(3);
			queue.enqueue(5);
			queue.enqueue(1);
			queue.enqueue(7);
			queue.getQueue(); // show the queue

			// get/ delete an element from the queue
			if (!queue.isEmpty()) {
				System.out.println("\nA node was extracted with the value: " + queue.dequeue());
			} else {
				System.out.println("\nThe Queue is empty");
			}
			queue.getQueue();

			break;
		}
		case 2: {
			Queue<Integer> queue = new LinkedList<>();
			queue.add(1);
			queue.add(2);
			queue.add(3);
			queue.add(4);
			queue.add(5);
			System.out.println(queue);
			System.out.println(queue.peek());
			queue.poll();
			System.out.println(queue);
			System.out.println(queue.peek());
			break;
		}
		case 3: {
			ArrayDeque<Integer> dq = new ArrayDeque<>();
			dq.offer(12);
			dq.offerFirst(15);
			dq.offerLast(20);
			dq.offer(30);
			System.out.println(dq);

			System.out.println(dq.pollLast());
			System.out.println(dq.pollFirst());

			System.out.println(dq.peekFirst());
			System.out.println(dq.peekLast());
			System.out.println(dq);
			break;
		}
		case 4: {
			Queue<Integer> queue = new PriorityQueue<>();
			queue.offer(10);
			queue.offer(0);
			queue.offer(8);
			queue.offer(7);
			queue.offer(9);
			
			System.out.println(queue);
			System.out.println(queue.peek());
			queue.poll();
			System.out.println(queue);
			System.out.println(queue.peek());
			
			Queue<Integer> queue1 = new PriorityQueue<>(Comparator.reverseOrder());
			queue1.offer(10);
			queue1.offer(0);
			queue1.offer(8);
			queue1.offer(7);
			queue1.offer(9);
			
			System.out.println(queue1);
			System.out.println(queue1.peek());
			queue1.poll();
			System.out.println(queue1);
			System.out.println(queue1.peek());
			break;
		}
		default:
			System.out.println("Unexpected value: " + opc);
		}

	}

}
