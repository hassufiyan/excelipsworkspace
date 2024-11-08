package com.xworkz.coding;



public class PalindromeInteger {
public static void main(String[] args) {
	

int n=121;
int r,n1=0,n2;

n2=n;

while(n>0) {
	r=n%10;
	n1=(n1*10)+r;
	n=n/10;
}

	
if(n2==n1) {
	System.out.println("palindrome number");
}
else {
	System.out.println("not a palindrome number");
}
}
}

















