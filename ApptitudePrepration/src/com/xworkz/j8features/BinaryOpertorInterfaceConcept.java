package com.xworkz.j8features;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOpertorInterfaceConcept {
	
	public static void main(String[] args) {
		
		//Binary operator interface is an inetrface which extends bi-functional inetrface 
		//and this bi-functional interface has one abstract method..
		//binary operator takes two operands of same type and returns the result as same of the input types...
		//bi-functional interface should be written with as bifunctional<t,t,t> with three parameters,where as binary neds only one..
		
		BinaryOperator<String> func= (x1,x2)-> x1.concat(x2);
		
	String	res=func.apply("make your"," own decisions");
		System.out.println(res);
	
	//using biFunctional interface
		
		BiFunction<Integer,Integer,Integer> func1= (x1,x2)-> x1+x2;
		
		int	res1=func1.apply(10,20);
	System.out.println(res1);
	
	BinaryOperator<String> func2= (x1,x2)-> x1.concat(x2);
	
	//String rel=func.andThen(func2).apply("Sufiyan");//here andthen method is not aplicable for biFunction interface....
	}

}
