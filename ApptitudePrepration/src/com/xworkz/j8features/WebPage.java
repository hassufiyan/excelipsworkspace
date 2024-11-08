package com.xworkz.j8features;


@FunctionalInterface//this means we have SAM-- Single Abstract Method,an interface with single abstract method is known 
//as functional INTERFACE....
//IT CAN BE INSTANTIATED BY ONLY LAMDA EXPRESSION,METHOD REFFERNCES OR CONSTRCTOR REFFERENCES...
public interface WebPage {
	
	void header(String value);
	
	//As we know that this is inetrface and we cannot create an objet of an interface because we have only abstract methods in it,
	//so what we basically do is we create a class which is implemented by this interface, 
	//and then we override the abstract method in that class,
	//to avoid this we have a feature called as lamda expression....and it isdenoted by "->" expression..

}
