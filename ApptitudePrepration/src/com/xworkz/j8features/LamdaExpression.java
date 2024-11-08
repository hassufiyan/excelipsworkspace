package com.xworkz.j8features;

public class LamdaExpression {
	
	public static void main(String[] args) {
	
//		WebPage w11=new WebPage() {
//			
//			@Override
//			public void header(String value) {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		WebPage w=(String value)-> System.out.println("hii "+value);
		
		//WebPage w1=(String value)-> System.out.println(value);
		
		//so here it is showing that we cannot instantiate type webpage,
		//so what we can do is use the concept of inner class..
		
		w.header("FaceBook");
		//so we have used the concept of annonymous inner class where we over ride an abstract method,
		//and "new WebPage behaves as an separate class"
	
		//so in java8 we have lamda expression,which can be used to reduce this code....
	//w1.header("Makes");
	
	
	
	}

}
