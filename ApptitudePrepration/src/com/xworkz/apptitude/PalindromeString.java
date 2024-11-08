package com.xworkz.apptitude;

import java.util.Scanner;

public class PalindromeString {
	
public static void main(String[] args) {
	
String pal="not";
String rev="";

String temp=pal;

int length=temp.length();

for(int i=length-1;i>=0;i--) 
	rev=rev+temp.charAt(i);

if(temp.equalsIgnoreCase(pal)) 
	System.out.println(pal +" is a palindrome");
else 
	System.out.println(pal +" is not a palindrome");
	
}	
}

   
//class PalindromeString 
//{  
//   public static void main(String args[])  
//   {  
//      String original, reverse = ""; 
//      Scanner in = new Scanner(System.in);   
//      System.out.println("Enter a string/number to check if it is a palindrome");  
//      String temp = in.nextLine();   
//      int length = temp.length();   
//      for ( int i = length - 1; i >= 0; i-- )  
//         reverse = reverse + temp.charAt(i);  
//      if (temp.equals(reverse))  
//         System.out.println("Entered string/number is a palindrome.");  
//      else  
//         System.out.println("Entered string/number isn't a palindrome.");   
//   }  
//}


