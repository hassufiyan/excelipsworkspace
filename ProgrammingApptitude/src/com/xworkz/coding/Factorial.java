package com.xworkz.coding;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("enter the number");
			int res = scn.nextInt();
			int result = 1;

			if (res >= 1 && res < 26) {
				
				while(res!=0){

					result = result * res;
					res--;

				}
				System.out.println(result);
			} else {
				System.out.println("enter the valid nummber");
			}

		}
	}
}
