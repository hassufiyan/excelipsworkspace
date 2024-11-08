package com.emids.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingTheFrequency {

	// public static void freuency(int[] arr,int n) {
//		
//		boolean [] visited=new boolean[n];
//		
//		for(int i=0;i<n;i++) {
//			
//			if(visited[i]==true) 
//				continue;
//			
//			
//			int count=0;
//		for(int j=i+1;j<n;j++) {
//			if(arr[i]==arr[j]) {
//				visited[j]=true;
//			
//		count++;
//		}
//		}
//		System.out.println(arr[i]+" "+count);
//		}
//	
//		
//		
//	}

//	Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
//	
//	for(int i=0;i<n;i++) {
//		if(mp.containsKey(arr[i])) {
//			mp.put(arr[i],mp.get(arr[i])+1);
//		}
//	
//	else {
//		mp.put(arr[i],1);
//	}
//}	
//	for(Map.Entry<Integer,Integer>  map:mp.entrySet()) {
//		System.out.println(map.getKey()+" "+map.getValue());
//	}
//	}

	public static void frequency(String s) {

//		Map<Character,Integer> mp=new HashMap<Character,Integer>();
//		
//		char[] c=s.toCharArray();
//			for(char cn:c) {
//		if(!String.valueOf(cn).isBlank()) 
//  if(mp.containsKey(cn)) {
//			mp.put(cn,mp.get(cn)+1);
//		}
//		else {
//			mp.put(cn,1);
//		}
//		
//	}
//			
//			
//for(Map.Entry<Character,Integer>  map:mp.entrySet()) {
//	System.out.println(s+": "+ map.getKey()+": "+map.getValue());
//}

		Map<String, Long> newCount = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(newCount);

	}

	public static void main(String[] args) {
		// int[] arr= {1,2,1,4,3,3,1,2};

//int n=arr.length;
//freuency(arr, n);

		frequency("aabbbcc abb");
	}

}
