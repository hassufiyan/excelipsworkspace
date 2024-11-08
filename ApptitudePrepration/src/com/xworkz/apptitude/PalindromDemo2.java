package com.xworkz.apptitude;

import java.util.Scanner;

public class PalindromDemo2 {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the number");	
		int input=scn.nextInt();
		
		int rem;
		int rev=0;
		int temp;

		temp=input;
	
	while(input!=0) {
		rem=input%10;//1,2,
		rev=(rev*10)+rem;//1,12,
		input=input/10;//12,1,
	}
		
	if(temp==rev) {
		System.out.println("Given "+rev+" is palindrome ");
	}
	else {
		System.out.println("Given "+rev+" is not palindrome");
	}
		
	}
	
}
