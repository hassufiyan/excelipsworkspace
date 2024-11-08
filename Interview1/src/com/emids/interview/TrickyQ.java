package com.emids.interview;

public class TrickyQ {
	
	/*COndition 1:
	 * in the below scenario static block wont be executed because its "Compiler Optimization",the compiler will pick up the 
	 * static variable from Common memory area and JVM wont load the class in the memory....
	 * 
	 * condition 2:
	 * if we make the static variable non-static,then static block will be executed...
	 */
	
	public static void main(String[] args) {

	System.out.println(MainTest.x);
//		System.out.println(new MainTest().x);
	}
	
	

}

class MainTest{
	static {
		System.out.println("Test---area");
	}
	public  final static int x=10; //--in this condition  the above static block wont be executed...
	
	
//	public final int x=20;

}