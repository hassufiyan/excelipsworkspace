package com.emids.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//find frequency of each element in an list
//Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

public class Frequency {
public static void main(String[] args) {
	
	
	List<String> s =Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
		
	
	Map<String,Long> n =s.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	
	
	
	System.out.println(n);
	
//	Set<String> n=s
//			.stream()
//			.filter(e -> Collections.frequency(s, e)>1)
//			.collect(Collectors.toSet());
//	
//		System.out.println(n);


		

	}

}
