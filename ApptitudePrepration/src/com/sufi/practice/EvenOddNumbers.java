package com.sufi.practice;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter any number");
		
	int	num=scn.nextInt();
		
		if(num % 2==0) {
			System.out.println(num +" is even");
		}
		else {
		System
		.out.println(num + " is odd" );
	}
	}
}
