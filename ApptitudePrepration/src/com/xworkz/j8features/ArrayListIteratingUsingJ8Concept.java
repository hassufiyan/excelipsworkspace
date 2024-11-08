package com.xworkz.j8features;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIteratingUsingJ8Concept {
	
	public static void main(String[] args) {

	List<String> tvSeries = Arrays.asList("Breaking Bad","Prison Break","Game Of Thrones","The walking Dead");	
		
		//1.Using java 8 forEach loop and lamda expression...
	
	tvSeries.forEach(shows -> 
		System.out.println(shows)//Here we are using lamda expression where foreach will iterate through tvSeries 
									//and give it to shows variable and it will print one by one
	);
		
	//2.Using Iterator of java 8..
	System.out.println("------------------Using Iterator of java 8..--------------");
	Iterator<String> it=tvSeries.iterator();
		
	while(it.hasNext()) {
	String	show=it.next();
	System.out.println(show);
	}
	
	//3.Using Iterator and forEachRemaining method of java 8..
		System.out.println("------------------Using Iterator and forEachRemaining method of java 8..--------------");
	
	it=tvSeries.iterator();
	
	it.forEachRemaining(series ->{
		System.out.println(series);
	});
	//4.Using  forEach loop  of java 8..
			System.out.println("------------------Using  forEach loop  of java 8..--------------");
			
		for(String series:tvSeries) {
			System.out.println(series);
		}
		//5.Using  for loop ..
		System.out.println("------------------Using  for loop ....--------------");
	
		for(int i=0;i<tvSeries.size();i++) {
			System.out.println(tvSeries.get(i));
		}
		//5.Using  ListIterator....
				System.out.println("------------------Using  ListIterator to print in both directions.... ....--------------");
	
	ListIterator<String> series=tvSeries.listIterator(tvSeries.size());
	
	while(series.hasPrevious()) {
	String	s1=series.previous();//we can travers it in forward direction by simply chaning previous to next...
	System.out.println(s1);
	}
	}

}
