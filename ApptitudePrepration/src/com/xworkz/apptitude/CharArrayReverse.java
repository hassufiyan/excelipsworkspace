package com.xworkz.apptitude;

public class CharArrayReverse {
	
public static void main(String[] args)
{
	
	
String input="Reverse of words";

char[] arr=input.toCharArray();

for(int i=arr.length-1;i>=0;i--) {
	System.out.print(arr[i]);
}
	
	
}	

}
