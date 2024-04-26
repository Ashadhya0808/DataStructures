package com.org.dataStructuresCources.sort;

public class MergeSortDescImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = { 21,35,-15,7,55,1,-22 };
		
		mergeSort(intArray, 0, intArray.length);
		
		for(int i = 0 ; i < intArray.length ; i++) {
			System.out.println(intArray[i]);
		}


	}
	
	public static void mergeSort(int[] intArray,int start, int end) {
		
		if(end - start < 2) {
			return;
		}
		
		int mid = (start + end) / 2;
		mergeSort(intArray,start,mid);
		mergeSort(intArray,mid,end);
		
		merge(intArray,start,mid,end);
	}
	
	public static void merge(int[] intArray,int start, int mid, int end) {
		
		if(intArray[mid -1] > intArray[mid]) {
			return;
		}
		
		int[] temArray = new int[end-start];
		int i = start; // for left Array
		int j = mid; //  for right Array
		int tempArrayIndex = 0; // index to add elements to temp array
		
		while(i < mid && j < end) {
			temArray[tempArrayIndex++] = intArray[i] >= intArray[j] ? intArray[i++] : intArray[j++];
		}
		// {35,32,30} {36,31} {36,35,32,31,30}
		System.arraycopy(intArray, i, intArray, start + tempArrayIndex, mid - i);
		System.arraycopy(temArray, 0, intArray, start, tempArrayIndex);
		
	}


}
