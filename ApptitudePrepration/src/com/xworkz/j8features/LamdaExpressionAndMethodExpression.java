package com.xworkz.j8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class LamdaExpressionAndMethodExpression {
	
	public static void main(String[] args) {
		
		
	List<String> namesList =Arrays.asList("Tom","Harry","Peter");	
	
	//1.using Annonymous class:this was introduced from JDK 1.8 ie;java8
	//annonymous class is nothing but we dont have to creatre a class which is implmenting particular Interface,
	//we can t directly implement by using annonymous where new keywprd followed by  Interface name with breaces behaves as a class..
	namesList.forEach(new Consumer<String>() {

		@Override
		public void accept(String t) {
			System.out.println(t);
			
		}
		
		
	
	});
		//2.using lamda expression:it is the replacement for annonymous class...
	
	System.out.println("------------");
	
	namesList.forEach(x -> System.out.println(x));
	
 					
			
//here the main aim is to iterate print the list of names either we can use simple for loop,forEach loop, 
	//or we can use the above annonymous class and lamda expression methods
	
	//3.replacing lamda expression by method refferences...
	System.out.println("--------------");
	
	namesList.forEach(System.out :: println);//this is how we print  using method refferences...
	
	
	
	
	}

}
