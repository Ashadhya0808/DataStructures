package com.org.DataStructuresAlgorithms.queues;

public class QueuesWithArrayImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayQueue queue = new ArrayQueue(5);
		
		ArrayCircularQueue queue = new ArrayCircularQueue(5);
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee johnEnd = new Employee("John", "End", 78);
        
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.remove();
        queue.add(marySmith);
        queue.remove();
        queue.add(mikeWilson);
        queue.remove();
        queue.add(johnEnd);
        queue.remove();
        queue.add(janeJones);
        queue.add(johnDoe);
        
        queue.printQueue();
        
        System.out.println("---------------------------------");
        
        //System.out.println(queue.peek());
        

	}

}
