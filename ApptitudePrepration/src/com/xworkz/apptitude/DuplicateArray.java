package com.xworkz.apptitude;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateArray {
	
	public static void main(String[] args) {
		
		
		//1st Method,worst solution(time complexity is O(n^2)) not considered much...
		
		String[] names= {"Java","Selenium","Core Java","ruby","Java","Selenium","Core Java"};
		
		for(int i=0;i<=names.length-1;i++) {
			for(int j=i+1;j<=names.length-1;j++) {
				if(names[i].equals(names[j])) {
				System.out.println("Duplicate ELements are: "+names[i]);
			}
			}
		}
		System.out.println("****************");
		//2nd method using Set,HashSet,much considered time complexity is O(n). 
		
		Set<String> store=new HashSet<String>();
		
		for(String name:names) {
		if(store.add(name)==false) {
			System.out.println("Duplicate ELements are: "+name);
		}
		
		
		
		
	}
		System.out.println("****************");
	//3rd method using HashMap
		
		Map<String,Integer> storeMap=new HashMap<String,Integer>();
		
		for(String name:names) {
		 Integer  count= storeMap.get(name);
			if(count==null) {
				storeMap.put(name,1);
			}
			else {
				storeMap.put(name,++count);
			}
		}
			
			Set<Entry<String,Integer>>		entrySet=storeMap.entrySet();
			
			for(Entry<String,Integer> entry:entrySet) {
				if(entry.getValue()>1) {
					System.out.println("Duplicate ELements are: "+entry.getKey());
				}
			}
		}
		
	

}

