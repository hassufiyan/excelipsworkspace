package com.sufi.practice;

public class MethodOverrididingPractice {

	static  public void   main(String args []) {//we can inter change access specifier and access modifier 
		//,but we cannot change the location of return type...

		//there are many ways to access the particular method of particular class in method overriding...below are some ways...
		
		//there are two methods to access any class in method overloading individually...
//method 1:	AnimalSimulator an=new AnimalSimulator();
		
		//by creating a separate class that doesnot extend any super classes,and have separate 
//	method which takes super most(Parent most class) as its parameter and has the access of its child classess methods,and in the main class 
		//we can create object of that class and acess any of the classes individually....
		
//	an.makeNoise(new Dog());
		
		//Animal an=new Animal();//this is creating the object of Parent most class and access its method...
		
		//Animal an=new Cat();//here upcasting is done to achive loose coupling....
		
//		Animal an1=new Dog();
//		
//		an.noise();
//		
//		an1.noise();
		
		
		//method 2:by using super keyword we can call any method of any call individually...
		Dog dog=new Dog();
		dog.noise();
//		dog.callAnimal();
//		dog.callAnimalNoise();
	//	dog.noise();
		
	//dog.callAnimal();	
		//the correct way to access the properties of superclass by creating the object of subclass is by using super keyword....
		//super keyword is used to acess the properties of super class in subclass....
		//it should be declared inside a method or consturtctor body.....
	}

}


