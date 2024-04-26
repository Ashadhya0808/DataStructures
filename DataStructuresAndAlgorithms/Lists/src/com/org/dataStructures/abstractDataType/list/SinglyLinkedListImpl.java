package com.org.dataStructures.abstractDataType.list;

import java.util.LinkedList;

public class SinglyLinkedListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeSinglyLinkedList employeeList = new EmployeeSinglyLinkedList();
		
		System.out.println("Is list empty - " + employeeList.isEmpty());
		
		employeeList.addNodeToFront(new Employee("Sha", "Run", 1));
		employeeList.addNodeToFront(new Employee("Run", "Ya", 2));
		employeeList.addNodeToFront(new Employee("Shas", "Runs", 3));
		employeeList.addNodeToFront(new Employee("Runs", "Yas", 4));
		
		System.out.println("Size - "+employeeList.getSize());
		employeeList.removeNodeFromFront();
		System.out.println("Size - "+employeeList.getSize());
		System.out.println("Is list empty - " + employeeList.isEmpty());
		
		employeeList.printList();
	}
	

}
