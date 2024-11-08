package com.xworkz.j8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsApiUsingFilter {

	public static void main(String[] args) {

List<Student> sList=Arrays.asList(new Student("Ahmed", 20),
		new Student("Kabir", 22),
		new Student("Zaheer", 18),
		new Student("Mustaq", 24),
		new Student("Kabir", 21));

	//using single condition... 


	Student snList=sList.stream()//convert list to Streams
	.filter(x -> "sachin".equals(x.getName())) //filtering using the condition
	.findAny()//if the variable is found it will return the variable...
	.orElse(null);//or else it will return null...

	System.out.println(snList.getName());
	
	System.out.println("-------------------------------");
	
	Student sn1List=sList.stream()//convert list to Streams
			.filter(x -> "Kabir".equals(x.getName()) && x.getAge() == 21) //filtering using the condition
			.findAny()//if the variable is found it will return the variable...
			.orElse(null);//or else it will return null...
	
	System.out.println(sn1List);
	}

}
