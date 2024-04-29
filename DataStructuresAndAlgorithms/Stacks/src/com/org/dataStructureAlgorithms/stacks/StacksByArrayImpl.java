package com.org.dataStructureAlgorithms.stacks;

public class StacksByArrayImpl {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(10);
		stack.push(new Employee("Sharanya", "Sagadam",1));
		stack.push(new Employee("Shanu", "Saga",2));
		stack.push(new Employee("Siri","para",3));
		
		stack.printStack();
		
		System.out.println("pop is: " + stack.pop());		
		System.out.println("Peek is: " + stack.peek());		
		stack.push(new Employee("Ash","Dar",4));
		
		System.out.println("After push Peek is: " + stack.peek());
		
		/*
		 * for(Employee employee : stack.returnStack()) { System.out.println(employee);
		 * }
		 */	
		
		stack.printStack();
	}
}
