package com.emids.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateArrays {

	public static String[] duplicateArray(String[] s) {

		// List<String[]> output= new ArrayList<>();

		// 1)using Brute force
//	for(int i=0;i<s.length;i++) {
//		for(int j=i+1;j<s.length;j++) {
//			if(s[i].equals(s[j])) {		
//				System.out.println(s[i]);
//				
//				
//			}
//			
//			
//		}
//		
//		
//	}
//	return null;
//}
		// -----------------------------
		Set<String> set = new HashSet<String>();

		for (String s1 : s) {

			if (set.contains(s1)) {
				System.out.println(s1);

			} else {
				set.add(s1);
			}
		}
		return null;

	}

	public static void main(String[] args) {

		String[] sr = { "Java", "Selenium", "Java", "CoreJava", "Selenium", "CoreJava", "Groovy", "Gradle" };
		Set<String> set = new HashSet<String>();

		System.out.println("Using stream and filter");

		Set<String> setChar = Arrays.asList(sr).stream().filter(e -> set.add(e)).collect(Collectors.toSet());

		System.out.println(setChar);

		System.out.println("Using stream and frequency");

		List<String> nList = Arrays.asList(sr);

Set<String> nSet =     nList.stream().filter(e -> Collections.frequency(nList, e)>1)
		 .collect(Collectors.toSet());

//System.out.println(nSet);

		Set<String> s1 = nList.stream().distinct().collect(Collectors.toSet());
		System.out.println(s1);

//	for(String s1:sr) {
//	
//	System.out.println(s1);
//	
//	}

//System.out.println(duplicateArray(sr));	
	}

}
