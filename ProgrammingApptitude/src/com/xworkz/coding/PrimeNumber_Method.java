package com.xworkz.coding;

import java.util.Scanner;

public class PrimeNumber_Method {
	public static void primeNumber(int number) {//2

		int m1 = 0;
		int f1 = 0;

		m1 = number / 2;//2/2=1;
		{
			if (number == 0 || number == 1) {//false,becoz 2 is not 0 || 1;
				System.out.println(number + " is not a prime number");
			} else 
		{
				for (int i = 2; i <= m1; i++) {
					if (number % i == 0) {
						System.out.println(number + " is not a prime number");
						f1 = 1;
						break;
					}
				}

				if (f1 == 0)
					System.out.println(number + " is prime number");
		}
			}
		}
	

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	

	while(true) {
		System.out.println("enter the number");
	int r1=scn.nextInt();
	 
		primeNumber(r1);

	}
	}	
}