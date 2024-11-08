package com.sufi.practice;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		//with temp variable
		int a=10;
		
		int b=20;
		
//		int temp=a;
//		
//		a=b;
//		
//		b=temp;
		
		
//System.out.println(b);
//System.out.println(a);

//without temp variable;
 a=a-b;//10-20=-10
 b=a+b;//-10+20=30
a=b-a;//10+10=20;

System.out.println(a);
System.out.println(b);
	}

}
