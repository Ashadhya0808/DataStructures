package com.org.dataStructuresCources.sort;

// O(n) time complexity
public class CountingSortImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {2,5,9,8,2,8,7,10,4,3};
		
		countingSort(input, 1,10);
		
		for(int i = 0 ; i < input.length ; i++) {
			System.out.println(input[i]);
		}

	}
	
	public static void countingSort(int[] input, int min,int max) {
		int[] countingArray = new int[(max - min) + 1];
		
		for(int i = 0 ; i < input.length ; i++) {
			countingArray[input[i] - min] +=1;
		}
		int j = 0;
		for (int i = min ; i < max ; i++) {
			while(countingArray[i-min] > 0) {
				input[j++] = i;
				countingArray[i-min]-=1;
			}
			
		}
	}

}