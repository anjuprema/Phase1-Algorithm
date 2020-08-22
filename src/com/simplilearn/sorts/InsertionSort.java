package com.simplilearn.sorts;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int intArr[] = {20 , 35 , -15, 8 , 55 , 2, -22};
		System.out.println("The Unsorted Array :"+Arrays.toString(intArr));
		
		for(int firstUnsortedIndex = 1 ; firstUnsortedIndex< intArr.length ; firstUnsortedIndex++) {
			int elem = intArr[firstUnsortedIndex];
			int i;
			for ( i= firstUnsortedIndex; i>0 && intArr[i-1] > elem; i-- ) {
				intArr[i] = intArr[i -1];
			}
			intArr[i] = elem;
		}
		System.out.println("The Sorted Array :"+Arrays.toString(intArr));
		
	}

}
