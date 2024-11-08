package com.xworkz.coding;

import java.util.Scanner;

public class Vowels_Consonants {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in); 
				System.out.println("enter the input");
		String s1=scn.next();
		int count=0;
		int cCount=0;
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				count++;
			
			}
		
			else if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
				cCount++;
		
		}
	}
	System.out.println("no. of vowels: "+count);
	System.out.println("no. of consonants: "+cCount);
		
			
			
		}
		
		
		
		
		
	}
	


