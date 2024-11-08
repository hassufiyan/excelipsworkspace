package com.xworkz.apptitude;

import java.util.Arrays;

public class LargestAndSmallest {
	
	public static void main(String[] args) {
	
	
	int [] number= {10,-1};

	
	int largest=number[0];
	int smallest=number[0];
	
	for(int i=1;i<number.length;i++) {
		if(number[i]>largest) {
			largest=number[i];
		}
	else if(number[i]<smallest) {
		smallest=number[i];
	}
	
}
	System.out.println("The numbers are :"+Arrays.toString(number));
	
	System.out.println("The largest number is :"+largest);
	
	System.out.println("The smallest number is :"+smallest);
	}
}
