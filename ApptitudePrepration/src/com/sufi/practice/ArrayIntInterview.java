package com.sufi.practice;

import java.util.Arrays;


public class ArrayIntInterview {

	public static int[] dupRevArray(int[] a) {

		int n = a.length;

		int[] newArray = new int[n];

		int count = 0;

		for (int i = n - 1; i >= 0; i--) {

			newArray[count] = a[i];
			count++;

		}
		return newArray;
	}

//		Set<Integer> set=new HashSet<>();
//		
//		for(int n1:a) {
//			
//			if(set.contains(n1)) {
//				System.out.println(n1);
//			}
//			else {
//				
//				set.add(n1);
//			}
//		}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 4, 5, 5, 6 };
		// to print the reverse array

		// duplicate element array..

		System.out.println(Arrays.toString(dupRevArray(arr)));

		// dupRevArray(arr);
	}

}
