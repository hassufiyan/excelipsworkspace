package com.emids.interview;


/*
 1)Can we compile and run the java program without using main method 
 Ans:yes(By using static blocks)
 
 *2)Can we create an object by keeping constructir private
 *Ans:Yes,within class we can create object that specific class..
 */
public class StaticBlockQ1 {
	
	static int age;
	int count;
	private StaticBlockQ1() {
		age=29;
	}
//we can create an object of the class which has private constructor is by creating obj inside 
	//static block or inside a static method...
	static {
		StaticBlockQ1 e1=new StaticBlockQ1();
		System.out.println("Static block 1");
		
	}
	
	public static void obj() {
		StaticBlockQ1 e1=new StaticBlockQ1();
	}
	
	static {
		StaticBlockQ1 e1=new StaticBlockQ1();//here the non static variable can be initialized inside static block 
		//by creating object of the class and accessing it with the object....
		e1.count=20;
		System.out.println("Static block 2");
		
	}
	
	static {
		System.out.println("Static block 3");
		
	}
	public static void main(String[] args) {
		StaticBlockQ1 e1=new StaticBlockQ1();
		System.out.println(e1.age);
	}
	
}
