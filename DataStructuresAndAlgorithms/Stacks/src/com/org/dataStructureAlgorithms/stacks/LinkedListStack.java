package com.org.dataStructureAlgorithms.stacks;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack {

	private LinkedList<Employee> stack;
	private int top = 0; 
	
	public LinkedListStack() {
		stack = new LinkedList<Employee>();
	}
	
	public void push(Employee employee) {
		stack.push(employee);
		top++;
	}
	
	public Employee pop() {
		if(isEmpty()) {
			throw new StackOverflowError();
		}
		top--;
		return stack.pop();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public Employee peek() {
		if(isEmpty()) {
			throw new StackOverflowError();
		}
		return stack.peek();
	}
	
	public void printStack() {
		ListIterator<Employee> iterator = stack.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
