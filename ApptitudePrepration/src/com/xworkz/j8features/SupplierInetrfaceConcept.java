package com.xworkz.j8features;

import java.util.function.Supplier;

public class SupplierInetrfaceConcept {
	
	public static void main(String[] args) {
		//it is the opposite of consumer where it takes nothing as input and returs something....
		
		getSup(() -> "Sufi");//here get[] is a normal method which takes supplier as parametere and then called in main method 
									//where get() takes no input but retruns something..
		getSup(() -> "Java");
		
	}

	public static void getSup(Supplier<String> text) {
		System.out.println(text.get());
	}
}
