package com.org.dataStructures.abstractDataType.list;

import java.util.ArrayList;
import java.util.List;

public class ListImpl {

	public static void main(String[] args) {

		/*
		 * Employee[] emp = new Employee[10]; emp[0] = new Employee("Sha", "Run", 1);
		 * emp[1] = new Employee("Ya", "Sha", 2); emp[2] = new Employee("Run", "ya", 3);
		 * emp[3] = new Employee("Sha", "Run", 4);
		 * 
		 * for(int i = 0 ; i < emp.length ; i++) { System.out.println("What? "+ i);
		 * System.out.println(emp[i].getFirstName()); }
		 */
		
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("Sha", "Run", 1)); 
		emps.add(new Employee("Ya", "Sha", 2));
		emps.add(new Employee("Run", "ya", 3));
		emps.add(new Employee("Sha", "Run", 4)); // O(1) as adds elements to the end of the list
		
		emps.add(2, new Employee("Ash","ish",5)); // O(n) if the index where we are adding new Employee is in between 0 to size of list as there is a need of arraycopy
		
		emps.set(3, new Employee("Runs","yas",6)); // O(1)
		
		//Object[] employeeArrayObject = emps.toArray(); returns object array is type not mentioned
		
		Employee[] employeeArray = emps.toArray(new Employee[emps.size()]);
		
		System.out.println(emps.contains(new Employee("Ya", "Sha", 2))); // returns false even if the object is present - if there is no equals method in Employee class
		System.out.println(emps.indexOf(new Employee("Sha", "Run", 4)));
		emps.forEach(emp -> System.out.println(emp)); 

		emps.remove(1); // o(n) as involves arraycopy method
		
		System.out.println("List: ");
		emps.forEach(emp -> System.out.println(emp)); // if toString method is not defined in Employee class then this prints Object notation of employees eg - com.org.dataStructures.abstractDataType.list.Employee@4c40875
		
		
		
		
		
	}

}
