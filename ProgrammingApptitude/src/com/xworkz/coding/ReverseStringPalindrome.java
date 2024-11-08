package com.xworkz.coding;

public class ReverseStringPalindrome {
	
	public static void ispalindrome(String s1) {
		
		int len= s1.length();
		String temp;
		String rev="";
		
		temp=s1;
	for(int i=len-1;i>=0;i--) {
		rev=rev+s1.charAt(i);
	}
	System.out.println(rev);
		if(rev.equals(temp)) {
			System.out.println("is palindrome");
		}else {
		System.out.println("not plaindrome");
	}
	}
public static void main(String[] args) {
	ispalindrome("teet");
}
}
