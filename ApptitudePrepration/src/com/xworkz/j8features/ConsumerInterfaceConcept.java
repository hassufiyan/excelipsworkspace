package com.xworkz.j8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {
		
		//It is an interface which takes one parameter and returns no result..
		
		Consumer<Integer> cons= x -> System.out.println(x);

		cons.accept(10);//ot is the only method present in consumer...
		
		//lets see the xample fo list
		
		List<Integer> col=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		col.forEach(x -> System.out.println(x));//here we are just printing the x values...
	}

}
