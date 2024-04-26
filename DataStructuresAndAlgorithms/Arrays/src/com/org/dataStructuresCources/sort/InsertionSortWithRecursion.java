package com.org.dataStructuresCources.sort;

public class InsertionSortWithRecursion {

	public static void main(String[] args) {
		
		int[] intArray = { 20,35,-15,7,55,1,-22 };
		
		insertionSort(intArray,1,intArray.length);
		
		for(int i = 0 ; i < intArray.length ; i++) {
			System.out.println(intArray[i]);
		}

	}

	private static void insertionSort(int[] intArray, int firstIndexOfUnsortedArray, int length) {
		
		if(firstIndexOfUnsortedArray >= length) {
			return;
		}
		
		int newElement = intArray[firstIndexOfUnsortedArray];
		int i;
		for(i = firstIndexOfUnsortedArray ; i > 0 && newElement>intArray[i-1]; i--) {
			intArray[i] = intArray[i-1];
		}
		intArray[i] = newElement;
		insertionSort(intArray, firstIndexOfUnsortedArray + 1, length);
	}

}
