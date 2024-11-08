package com.xworkz.apptitude;

import java.util.Arrays;

public class ShiftZerosToRIght {
	
	public static int[] shiftToRight(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int newArray[]=new int[arr.length];
		
		int count =0;
		for(int number:arr) {
			if(number!=0) {
				newArray[count]=number;
				count++;
			}
			
		}
		return newArray;
	}
public static void main(String[] args) {
	int [] i= new int[] {1,3,0,1,0};
	
	System.out.println(Arrays.toString(shiftToRight(i)));
	
	 i=new int[] {1};
	
	System.out.println(Arrays.toString(shiftToRight(i)));
	
i=new int[] {0,0,0,1,9,6,7,8};
	
	System.out.println(Arrays.toString(shiftToRight(i)));
	
}
}
