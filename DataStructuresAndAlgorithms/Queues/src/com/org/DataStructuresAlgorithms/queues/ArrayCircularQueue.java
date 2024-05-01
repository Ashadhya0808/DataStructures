package com.org.DataStructuresAlgorithms.queues;

import java.util.NoSuchElementException;

public class ArrayCircularQueue { // add at the back and delete from front - FIFO in a circular way
	
	private Employee[] queue;
	private int front;
	private int back;
	
	public ArrayCircularQueue(int capacity) {
		queue = new Employee[capacity];
	}
	
	public void add(Employee employee) { 
		if(size() == queue.length-1) {  // back is always the next position the the object needs to be inserted 
			                            //that is the reason we check for length - 1 so the back would be length + 1 after we add new object at length
			//need to resize the array
			int numItems = size();
			Employee[] newArray = new Employee[2 * queue.length];
			
			System.arraycopy(queue, front , newArray, 0, queue.length - front); // This adds to O(n) time complexity
			System.arraycopy(queue, 0, newArray, queue.length - front, back);
			
			queue = newArray;
			
			front = 0;
			back = numItems;
		}
		queue[back] = employee;
		if(back < queue.length-1) { // back is always the next position the the object needs to be inserted
			back++;
		}else {
			back=0;
		}
	}
	
	public Employee remove() {
		if(isEmpty()) {
			throw new NoSuchElementException();		
		}
		Employee removedEmployee = queue[front];
		queue[front] = null;
		if(front < queue.length) {
			front++;
		}else {
			front = 0;
		}
		
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
		if(front <= back) {
			return back - front;
		}
		else {
			return back - front + queue.length;
		}
	}
	
	public boolean isEmpty() {	
		return front == back;
	}
	
	public void printQueue() {
		if(front <= back) {
			for(int i = front; i < back ; i++) {
				System.out.println(queue[i]);
			}
		}else {
			for(int i = front ; i < queue.length ; i++) {
				System.out.println(queue[i]);
			}
			for(int i = 0 ; i < back ; i++) {
				System.out.println(queue[i]);
			}
		}
	}
}
