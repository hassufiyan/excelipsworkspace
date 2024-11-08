package com.xworkz.apptitude;

import java.util.Scanner;

public class PalindromeInteger {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the input");
		
		while(true) {
		int	input=scn.nextInt();
		int temp=input;
		int sum=0,rem;
	
		while(temp!=0) {  
			rem=temp%10;
			sum=(sum*10)+rem;
			temp=temp/10;
		}
		
		if(input==sum) {
			System.out.println(input +" is a palindrome");
		}
		else {
		System.out.println(input +" is not a palindrome");
		}
		}
	}
}

//		Scanner scn=new Scanner(System.in);
//		System.out.println("Enter the input");
		
	//int	num=scn.nextInt();
	
	//int rem;
	//int res=0;
	//int count=0;
	//while(num!=0) {
		//rem=num%10;
		//res=(res*10)+res;
		//num=num/10;
		//count++;
	//}
		//System.out.println(count);
	
	//System.out.println(res);
	//}
		
		
//}
