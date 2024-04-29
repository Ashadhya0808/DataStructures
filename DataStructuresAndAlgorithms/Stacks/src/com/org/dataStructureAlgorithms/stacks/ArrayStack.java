package com.org.dataStructureAlgorithms.stacks;

import java.util.EmptyStackException;

public class ArrayStack {
	
	private Employee[] stack;
	private int top = 0;
	
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	
	public void push(Employee employee) { // Worst case - O(n)
		if(top == stack.length) {
			//need to resize the array
			Employee[] newArray = new Employee[2 * stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length); // This adds to O(n) time complexity
			stack = newArray;
		}
		stack[top++] = employee; // If only this then Time complexity is O(1)
	}
	
	public Employee pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Employee removedEmployee = stack[top-1];
		stack[top-1] = null;
		top--;
		return removedEmployee;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public Employee peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}
	
	public Employee[] returnStack() {
		return stack;
	}
	
	public void printStack() {
		for(int i=top-1 ; i>=0 ; i--) {
			System.out.println(stack[i]);
		}
	}
	 
}
