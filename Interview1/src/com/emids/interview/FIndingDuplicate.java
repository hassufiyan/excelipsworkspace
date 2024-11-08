package com.emids.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FIndingDuplicate {
	
	public static void duplicate(String s) {
		
		if(s==null) {
			System.out.println("String is null");
		return;
		}
	
	if(s.isEmpty()) {
		System.out.println("String is Empty");
		return;
	}
	if(s.length()==1) {
		System.out.println("string is single characters");
		return;
	}
	
	char[] ch=s.toCharArray();
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	
	for(char chr:ch) {
		if(map.containsKey(chr)) {
			map.put(chr,map.get(chr)+1);
		}
		else {
		map.put(chr,1);
	}
	}
	
	for(Entry<Character, Integer> entry:map.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	
	}
	public static void main(String[] args) {

//		duplicate("");
//		duplicate(null);
//		duplicate("Java");
//		duplicate("SUfiss");
		//duplicate("aabbbcccc");
		duplicate("This year was the hottest year in the history");
		
	}

	
	
	
	
	
	
	
	
	
	

}
