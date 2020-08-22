package com.simplilearn.searchs;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		int[] intArr = { -15 , -7 ,  2 , 3 , 10 , 40 , 55 , 69, 80 , 99 , 109} ;
		
		
		int pos = exponentialSearch(intArr, -15);
		System.out.println("The Element found at : "+pos);
		

	}
	
	public static int	exponentialSearch(int[] input , int searchVale) {
		
		if(input[0] == searchVale)
			return 0;		
		
		// define a range 
		// doubling method
		int i = 1;
		while(i< input.length && input[i]<= searchVale) {
			i = i*2;
		}
		// binary search 
		return Arrays.binarySearch(input, i/2, Math.min(i, input.length), searchVale);
	}
	

}
