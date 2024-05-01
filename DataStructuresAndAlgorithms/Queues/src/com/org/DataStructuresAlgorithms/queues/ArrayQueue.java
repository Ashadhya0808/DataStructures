package com.org.DataStructuresAlgorithms.queues;

import java.util.NoSuchElementException;

public class ArrayQueue { // add at the back and delete from front - FIFO
	
	private Employee[] queue;
	private int front;
	private int back;
	
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}
	
	public void add(Employee employee) {
		
		if(isEmpty()) { // reassigning the front and back of the queue to 0 if no elements are present
			front = back = 0;
		}
		
		if(back == queue.length) {
			//need to resize the array
			Employee[] newArray = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArray, 0, queue.length); // This adds to O(n) time complexity
			queue = newArray;
		}
		
		queue[back++] = employee;
	}
	
	public Employee remove() {
		if(isEmpty()) {
			throw new NoSuchElementException();		
		}
		Employee removedEmployee = queue[front];
		queue[front] = null;
		front++;
		
		if(isEmpty()) { // reassigning the front and back of the queue to 0 if no elements are present
			front = back = 0;
		}
		
		return removedEmployee;
	}
	
	public Employee peek() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return queue[front];
	}
	
	public int size() {
		return back - front;
	}
	
	public boolean isEmpty() {	
		return front == back;
	}
	
	public void printQueue() {
		for(int i = front; i<back ; i++) {
			System.out.println(queue[i]);
		}
	}
}
