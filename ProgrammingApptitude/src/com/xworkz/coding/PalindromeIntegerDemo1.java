package com.xworkz.coding;


import java.util.Scanner;
public class PalindromeIntegerDemo1 {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	while(true) {
		System.out.println("enter the number");
	int d=scr.nextInt();
	int temp,sum=0,r;
	temp=d;
	
	while(d>0) {
	r=d%10;
	temp=r+(sum*10);
	d=d/10;
	}
if(temp==sum) {
	System.out.println("palindrom number");
}
else {
	System.out.println("not a palindrome number");
}

}
	}
	}