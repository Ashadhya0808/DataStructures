package com.org.dataStructuresCources.sort;


/*Time Complexity of BubbleSort is O(n2)[Quadratic] - as we are using 2 for loops
 It is a Stable Sorting Algorithm*/
public class BubbleSortImpl {

	public static void main(String[] args) {
		
		int[] intArray = { 20,35,-15,7,55,1,-22 };
		
		for(int lastUnsortedIndex = intArray.length - 1 ; 
				lastUnsortedIndex > 0 ; lastUnsortedIndex--){
				for (int i = 0 ; i < lastUnsortedIndex ; i++) {
					if(intArray[i]>intArray[i+1]) {
						intArray = swap(intArray, i, i+1);
					}
				}
			
		}
		for(int i = 0 ; i < intArray.length ; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	public static int[] swap(int[] array, int i, int j) {
		if(i==j) {
			return array;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		return array;
	}

}