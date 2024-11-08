package com.xworkz.coding;

import java.util.Scanner;

public class Reverse_Recurssion {

	public static String reverseRec(String input) {

		if (input != null && input.isEmpty()) {
			return input;
		} else {
			return input.charAt(input.length()-1) + reverseRec(input.substring(0, input.length()-1));


		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("enter the input");
			String rev = scn.next();
			System.out.println(Reverse_Recurssion.reverseRec(rev));
//			System.out.println(reverseRec(rev));
//			break;
		}
	}
}
