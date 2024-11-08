package com.xworkz.coding;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the input");
	
		
		String s1=scn.next();
		s1.toLowerCase();
		s1.toUpperCase();
		int count=0;
		
		while(true) {	
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U') {
				count++;
			
			}
		}
		 System.out.println("no.of vowels in given string is: " +count);
			break;
		}
		
		
		
		
	}
		
	}
	


