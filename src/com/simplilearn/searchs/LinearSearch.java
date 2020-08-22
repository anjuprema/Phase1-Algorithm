package com.simplilearn.searchs;

public class LinearSearch {

	public static void main(String[] args) {
		
		// declare a int []
		int []  intArr = { 20 , 50 , 35, -15, 7 , 1 , 55, -22};
		// search  -15
		int position = linearSearch(intArr,1);
		System.out.println("The Element 1 is Found at position :- " +position);
		
		int position2 = linearSearch(intArr,-22);
		System.out.println("The Element -22 is Found at position :- " +position2);
		
		int position3 = linearSearch(intArr,888);
		System.out.println("The Element 888 is Found at position :- " +position3);
	}
	
	public static int linearSearch(int[] input , int searchVal) {
		// search through an array
		for( int index = 0 ; index < input.length ; index++ ) {
			if(input[index] == searchVal) {
				return index;
			}			
		}
		return  -1;
	}

}

// WAP  :to take user input values  -> insert those values in array 
// take a searh value and find that value form the array.