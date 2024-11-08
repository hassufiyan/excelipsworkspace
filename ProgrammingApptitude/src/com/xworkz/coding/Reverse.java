package com.xworkz.coding;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the input");
		while (true) {
			String input = scn.next();
			String reverse = " ";

			if (input != null && input.isEmpty()) {
				System.out.println(input);
			} else {

				for (int i = input.length() - 1; i >= 0; i--) {
					reverse = reverse + input.charAt(i);
				}
			}

			System.out.println(reverse);
			}
	}
}

