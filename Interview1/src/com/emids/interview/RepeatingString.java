package com.emids.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatingString {

	public static void repeatation(String w) {
		
		System.out.println("The String is: "+w);
//		Set<String> set=new HashSet<String>();
		Map<String,Integer> map=new HashMap<String,Integer>();
		
	
		
		
		
		
		String[] w1=w.split(" ");
		System.out.println("The String of array are: "+Arrays.toString(w1));
		
		for(String s:w1) {
		String	s1=s.toLowerCase();
		if(map.containsKey(s1)) {
			map.put(s1,map.get(s1)+1);
		}
		else {
			map.put(s1,1);
		}
		
		}
		for(Entry<String, Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
//		int count=0;
//		for(String s:w1) {
//			if(set.contains(s)) {
//				System.out.println(s);
//			}
//			else {
//				set.add(s);
//			}
//		}
		
//	Set<String>	setWords=Arrays.asList(w1).stream().filter(e-> !set.add(e)).collect(Collectors.toSet());
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		String word="Good Morning All All all Morning Good Hello Hello hello";

//	repeatation(word);
	
		Map<String,Long> map=Arrays.stream(word.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
		System.out.println(map);
	}
	

}
