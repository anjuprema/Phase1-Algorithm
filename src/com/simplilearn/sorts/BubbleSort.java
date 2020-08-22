package com.simplilearn.sorts;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int intArray[]  = { 20 , 35 , -15 , 7 ,55, 1, 22 };
		System.out.println("Unsorted Array :="+Arrays.toString(intArray));
		
		for(int last = intArray.length -1; last > 0 ;last --) {
			for(int i = 0 ; i< last; i++) {
				if(intArray[i] > intArray[i+1]) {
					swap(intArray, i, i+1);
				}
			}
			
		}
		
		System.out.println("Sorted Array :="+Arrays.toString(intArray));
	}
	
	//  swap element 
	public static void swap(int[] input, int i , int j) {
		if(i == j) {
			return ;
		}
//		int temp = input[i];
//		input[i] = input[j];
//		input[j] = temp;
		input[i] = input[i] + input[j];
		input[j] = input[i] - input[j];
		input[i] = input[i] - input[j];
		}
}
