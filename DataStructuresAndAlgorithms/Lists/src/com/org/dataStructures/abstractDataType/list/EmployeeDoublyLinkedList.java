package com.org.dataStructures.abstractDataType.list;

public class EmployeeDoublyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	
	private int size;
	
	public void addNodeToFront(Employee employee) {
		EmployeeNode newNode = new EmployeeNode(employee);
		//newNode.setPrevious(null);
		if(isEmpty()) {
			tail = newNode;
		}else {
			head.setPrevious(newNode);
			newNode.setNext(head);
		}
		head = newNode;
		size++;
	}
	
	public void addNodeToEnd(Employee employee) {
		EmployeeNode newNode = new EmployeeNode(employee);
		//newNode.setNext(null);
		if(isEmpty()) {
			head = newNode;
		}else {
			tail.setNext(newNode);
			newNode.setPrevious(tail);
		}
		tail = newNode;
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		if(head == null && tail == null) {
			return true;
		}
		return false;
	}
	
	public EmployeeNode removeNodeFromFront() {
		
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = head;
		if(removedNode.getNext() == null) {
			tail = null;
		}
		head = removedNode.getNext();
		head.setPrevious(removedNode.getPrevious());
		size--;
		removedNode.setNext(null);
		return removedNode;
		
	}
	
	public EmployeeNode removeNodeFromEnd() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = tail;
		if(removedNode.getPrevious() == null) {
			head = null;
		}
		tail = removedNode.getPrevious();
		tail.setNext(removedNode.getNext());
		size--;
		removedNode.setPrevious(null);
		return removedNode;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while(current != null) {
			System.out.print(current);
			System.out.print(" <-> ");
			current = current.getNext();
		}
		System.out.print("null");
	}

	public boolean addBefore(Employee newEmployee, Employee oldEmployee) {
		
		EmployeeNode checkOldEmployeeNode = head;
		
		while(checkOldEmployeeNode != null && !checkOldEmployeeNode.getEmployee().equals(oldEmployee)) {
			checkOldEmployeeNode = checkOldEmployeeNode.getNext();
		}
		if(checkOldEmployeeNode == null) {
			System.out.println("Employee Not Found or the list is empty");
			return false;
		}
		
		EmployeeNode newEmployeeNode = new EmployeeNode(newEmployee);
		if(checkOldEmployeeNode.getPrevious() == null) {
			head = newEmployeeNode;
		}
		else {
			newEmployeeNode.setPrevious(checkOldEmployeeNode.getPrevious());
			checkOldEmployeeNode.getPrevious().setNext(newEmployeeNode);
		}
		newEmployeeNode.setNext(checkOldEmployeeNode);
		checkOldEmployeeNode.setPrevious(newEmployeeNode);
		size++;
		return true;
	}
	
	public boolean addAfter(Employee newEmployee, Employee oldEmployee) {
		
		EmployeeNode checkOldEmployeeNode = head;
		
		while(checkOldEmployeeNode != null && !checkOldEmployeeNode.getEmployee().equals(oldEmployee)) {
			checkOldEmployeeNode = checkOldEmployeeNode.getNext();
		}
		if(checkOldEmployeeNode == null) {
			System.out.println("Employee Not Found or list is empty");
			return false;
		}
		
		EmployeeNode newEmployeeNode = new EmployeeNode(newEmployee);
		if(checkOldEmployeeNode.getNext() == null) {
			tail = newEmployeeNode;
		}
		else {
			newEmployeeNode.setNext(checkOldEmployeeNode.getNext());
			checkOldEmployeeNode.getNext().setPrevious(newEmployeeNode);
		}
		newEmployeeNode.setPrevious(checkOldEmployeeNode);
		checkOldEmployeeNode.setNext(newEmployeeNode);
		size++;
		return true;
	}

}
