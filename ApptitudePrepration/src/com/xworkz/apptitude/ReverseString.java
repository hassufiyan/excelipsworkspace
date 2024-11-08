package com.xworkz.apptitude;

public class ReverseString {
	
 static void main(String[] args) {
	
	String input="Reverse it for you";
	String reverse="";
	
	for(int i=input.length()-1;i>=0;i--) {
		reverse=reverse+input.charAt(i);
	}
	System.out.println(reverse);
	
}	
	

}
