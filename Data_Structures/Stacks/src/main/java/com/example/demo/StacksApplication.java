package com.example.demo;

import java.util.Scanner;
import java.util.Stack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.stacks.StackClass;

@SpringBootApplication
public class StacksApplication {

	public static void main(String[] args) {
		SpringApplication.run(StacksApplication.class, args);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1. Stacks Integers\n2. Stacks Characters \n3. Stacks with java.util \nSelect an opction: ");
		int opc = keyboard.nextInt();
		switch (opc) {
		case 1: {
			StackClass<Integer> s = new StackClass<Integer>(); //can't use the primitive data so we use the Integer wrapper
			s.push(34);
			s.push(45);
			s.push(44);
			System.out.println(s); // FILO
			
			s.pop(); // delete
			System.out.println(s);
			System.out.println(s.peek()); //get the first
			System.out.println(s);		
			
			break;
		}
		case 2: {
			StackClass<Character> s = new StackClass<Character>(); 
			s.push('a');//add
			s.push('g');
			s.push('s');
			System.out.println(s); // FILO
			
			s.pop(); //delete
			System.out.println(s);
			System.out.println(s.peek()); 
			System.out.println(s.search('s')); 
			System.out.println(s); 
			
			
		
			break;
		}
		case 3: {
			Stack<String> stackOfNames =  new Stack<>();
			stackOfNames.push("Chris");
			stackOfNames.push("Jack");
			stackOfNames.push("Alex");
			System.out.println("Stack: " + stackOfNames); // FILO
			
			System.out.println("Peek stack -> " + stackOfNames.peek()); 	
			System.out.println("Stack.pop() -> " + stackOfNames.pop());
			System.out.println("Current stack -> " + stackOfNames); 	
			System.out.println("Search name in the stack -> " + stackOfNames.search("Jack"));  // return position
			
			break;
		}
		default:
			System.out.println("Unexpected value: " + opc);
		}
		
		
	}

}
