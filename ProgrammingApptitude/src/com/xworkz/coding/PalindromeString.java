package com.xworkz.coding;
import java.util.Scanner;

public class PalindromeString {

	public static String reverse(String input) {
		
		if(input==null || input.isEmpty()) {
			return input;
		}
		else {
			return input.charAt(input.length()-1)+reverse(input.substring(0,input.length()-1));
		}
	}
	public static String isPalindrome(String value) {
		String res=reverse(value);
		
		if(value.equals(res)) {
			return "palindrome";
		}
		else {
			return "not a palindrome";
		}
	}
	
	public static void main(String[] args) {
		
	System.out.println("Enter the String");
	try(Scanner scr=new Scanner(System.in)){
		int num=Integer.MAX_VALUE;
		
		while(num!=0) {
			String value=scr.next();
			
			System.out.println(isPalindrome(value));
		}
	}
				
	}
}
				
				

	
		
	
	
	
	

