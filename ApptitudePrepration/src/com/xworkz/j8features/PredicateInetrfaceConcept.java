package com.xworkz.j8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateInetrfaceConcept {

	public static void main(String[] args) {
		
		
		//Predicate is an inetrface Which takes one input of any type and returns boolean as result for ex;check names in list,2>5...
		
		Predicate<Integer> func=x-> x<2;
		
		List<Integer> colList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
//		List<Integer> l1=colList.stream().filter(func).collect(Collectors.toList());
//		System.out.println(l1);
		
		//Predicates with && and || operators
//Predicate<Integer> func1=x-> x<2;
		
//		List<Integer> col=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
List<Integer> list=colList.stream().filter(x -> x > 2 && x < 9).collect(Collectors.toList());

System.out.println(list);


//predicate with negate

List<String> names= Arrays.asList("Sufiyan","Sufi","java","jav","ja"); 

Predicate<String> namesList= x -> x.startsWith("Sufiyan");

List<String> l1=names.stream().filter(namesList.negate()).collect(Collectors.toList());

System.out.println(l1);//here negate will exclude the given predicate(condition)...
	}
}
