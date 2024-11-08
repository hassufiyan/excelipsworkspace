package com.emids.interview;

import java.util.Arrays;

public class ShiftingArrayNormal {

	public static String[] rotate(String[] arr) {

		String[] newArray = new String[arr.length];
//		String temp=arr[0];

		String temp = arr[0];
		for (String s : arr) {
			newArray[0] = arr[2];
			newArray[1] = arr[1];
			newArray[2] = arr[0];
			newArray[3] = arr[3];

		}
		return newArray;
	}

//		for(int i=0;i<arr.length-1;i++) {
//			
//			newArray[i]=arr[i+1];
//			newArray[arr.length-2]=temp;
//			newArray[arr.length-1]=arr[3];
//			
//		}
//		return newArray;

//		String temp=arr[0];
//		
//		for(int i=0;i<arr.length;i++) {
//		
//			arr[0]=arr[3];
//			arr[3]=temp;
//			
//		}
//		
//		return arr;

//	String temp=arr[0];
//	String t=arr[2];
//	
//	for(int i=0;i<arr.length;i++) {
//	arr[i]=t;
//	arr[i+2]=temp;
//	
//			
//		}
//	return  arr;
//	}

	public static void main(String[] args) {

//		int [] arr= {0,1,2,3,4,6,5};

		String[] arr = { "mom", "Dad", "Sis", "Bro" };
		System.out.println(Arrays.toString(rotate(arr)));
	}
}
