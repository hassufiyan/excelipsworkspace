package com.emids.interview;

import java.util.Arrays;

public class ShfitingArrayElements {
	
	public static int[] shift(int [] arr) {
		
		int[] newArray=new int[arr.length];
		
		int count=0;
		for(int a:arr) {
			if(a!=0) {
				newArray[count]=a;
				count++;
				
			}
		}
		return newArray;
		
	}
	
	
	
	
	public static void main(String[] args) {
		int [] arr= {1,0,2,0,3,8,9,0};
		
		System.out.println(Arrays.toString(shift(arr)));
	}

}
