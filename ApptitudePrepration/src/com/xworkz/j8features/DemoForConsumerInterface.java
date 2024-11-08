package com.xworkz.j8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoForConsumerInterface {
	
	
	
	
	

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4);
		
//		System.out.println(list.get(1));
		
	Consumer<Integer> c= i -> System.out.println(i);
		list.forEach(c);
		
	}

	}

