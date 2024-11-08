package com.xworkz.j8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInetrfaceConcept {
	
	public static void main(String[] args) {
		
		//Unary  operator extends Function inetrface..it takes one operand and retyrns the result of same type as the input type..
		
		UnaryOperator<Integer> func=x-> x*9;
		
		System.out.println(func.apply(20));
		
		Function<Integer,Integer> func1=x-> x+9;
		
		System.out.println(func1.apply(30));
		
		//we can use unary operator forlist also such as...
		
		List<String> lanList=new ArrayList<String>();
		
		lanList.add("java");
		lanList.add("Ruby");
		lanList.add("java");
		
		System.out.println(lanList);
		
		lanList.replaceAll(e -> e.toLowerCase());
	
		System.out.println(lanList);
	}

}
