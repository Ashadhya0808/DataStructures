package com.org.dataStructuresCources.sort;

public class QuickSortImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 21,35,-15,7,55,1,-22 };
		
		quickSort(intArray, 0, intArray.length);
		
		for(int i = 0 ; i < intArray.length ; i++) {
			System.out.println(intArray[i]);
		}
		
	}

	private static void quickSort(int[] intArray, int start, int end) {
		
		if(end - start < 2) {
			return;
		}
		
		int pivotIndex = findPivotIndex(intArray, start, end);
		quickSort(intArray,start,pivotIndex);
		quickSort(intArray,pivotIndex+1,end);
		
		
	}

	private static int findPivotIndex(int[] intArray, int start, int end) {
		
		int pivot = intArray[start];
		int i = start;
		int j = end;
		
		while(i<j) {
			
			// empty body to place j at position where intArray[j] < pivot to swap with ith place
			while(i<j && intArray[--j] >= pivot);
			if(i<j) {
				intArray[i] = intArray[j];
			}
			
			// empty body to place i at position where intArray[i] > pivot to swap with jth place
			while(i<j && intArray[++i] <= pivot);
			if(i<j) {
				intArray[j] = intArray[i];
			}

			
		}
		intArray[j] = pivot;
		
		return j;
	}

}
