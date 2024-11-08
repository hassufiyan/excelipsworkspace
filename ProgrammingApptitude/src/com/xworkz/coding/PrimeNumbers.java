package com.xworkz.coding;


import java.util.Scanner;
public class PrimeNumbers {
	
	public static void main(String[] args) {
		while(true) {
			Scanner scn=new Scanner(System.in);

		System.out.println("enter the number");
		int number=scn.nextInt();
		int m1=0; 
		int f1 = 0;

		m1 = number / 2;
		if (number == 0 || number == 1) {
			System.out.println(number + " is not prime number");
		}

		else {
			for (int i = 2; i <= m1; i++) {
				if (number % i == 0) {
					System.out.println(number + " is not a prime number");
					f1 = 1;
					break;
				}
			}

			if (f1 == 0) 
				System.out.println(number + " is a prime number");
		}	
		}
		}
}

