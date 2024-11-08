package com.emids.interview;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		
		int num=565;
		
		int res=0;
		int rem;
		
		int temp=num;
		while(num>0) {
			rem=num%10;//1,2,
			res=rem+(res*10);//1,120
			num=num/10;//12,1
			
		}
		if(temp==res) {
			System.out.println(temp+" is Palindrome");
		}
		else {
			System.out.println(temp+" not palindrome");
		}
	}
}
