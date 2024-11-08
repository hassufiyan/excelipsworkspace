package com.xworkz.j8features;

import java.util.function.Function;

public interface FunctionInterfaceConcept {
	
	public static void main(String[] args) {
		
	
	
	/**FunctionInterface
	 * An interface which has onl one an=bstract method and can have static and default methods..
	 * it takes T and R as parametere where T is the input of the finction and R is the result of the function...
	 */
	
	Function<String,Integer> func= x -> x.length();
			 
			
System.out.println(func.apply("This is java8 features"));

//Function chaining;

Function<Integer,Integer> func1= x -> x*2;	

int res=func.andThen(func1).apply("Sufiyan");//here first the function will be given to func and then to func1...
System.out.println(res);
}
}
