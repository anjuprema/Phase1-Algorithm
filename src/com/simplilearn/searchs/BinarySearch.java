package com.simplilearn.searchs;

public class BinarySearch {

	public static void main(String[] args) {

		int[] intArr = { -22, -15, -3, -1, 7, 9, 20, 35, 55 };

		// iterative search

//		int position = iterativeBinarySearch(intArr, -15);
//		System.out.println("The Element is Found at index : " + position);

		// recursive search
		int pos = recursiveBinarySearch(intArr, 20);
		System.out.println("The Element is Found at index : " + pos);

	}

	public static int iterativeBinarySearch(int[] input, int searchVal) {
		int start = 0;
		int end = input.length - 1;
		// start search
		while (start < end) {
			int midpoint = (start + end) / 2;
			System.out.println("start = " + start);
			System.out.println("midpoint = " + midpoint);
			System.out.println("end = " + end);
			// mid value is the search
			if (input[midpoint] == searchVal) {
				return midpoint;
			}
			// search in right half
			else if (input[midpoint] < searchVal) {
				start = midpoint + 1;
			}
			// search in left half
			else {
				end = midpoint - 1;
			}

		}
		// if do not found search value.
		return -1;
	}

	public static int recursiveBinarySearch(int[] input, int searchVal) {
		return recursiveBinarySearch(input, 0, input.length - 1, searchVal);
	}

	public static int recursiveBinarySearch(int[] input, int start, int end, int searchVal) {
		// breaking condition
		// if value not found
		if (start >= end) {
			return -1;
		}

		int midpoint = (start + end) / 2;
		System.out.println("start = " + start);
		System.out.println("midpoint = " + midpoint);
		System.out.println("end = " + end);

		// mid value is the search
		if (input[midpoint] == searchVal) {
			return midpoint;
		}
		
		// search in right half
		else if (input[midpoint] < searchVal) {
			return recursiveBinarySearch(input, midpoint+1, end, searchVal);
		}
		// search in left half
		else {
			return recursiveBinarySearch(input, start , midpoint-1, searchVal);
		}

	}
}

//Ex :  Take user input to search value 
