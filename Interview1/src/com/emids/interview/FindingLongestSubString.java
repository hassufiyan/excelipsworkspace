package com.emids.interview;

import java.util.HashSet;

public class FindingLongestSubString {
	
	
	public static int longestSubString(String s) {
		int i=0;
		int j=0;
		int max=0;
		
	int l=s.length();
	
	HashSet<Character> set=new HashSet<Character>();
	
	while(j<l) {
		if(!set.contains(s.charAt(j))) {
			set.add(s.charAt(j));
			j++;
			max=Math.max(max,set.size());
			
			
		}
		else {
			set.remove(s.charAt(i));
			i++;
			
		}
	}
				return max;
	}
public static void main(String[] args) {
	String s="his his";
	
	System.out.println(longestSubString(s));
}
}
