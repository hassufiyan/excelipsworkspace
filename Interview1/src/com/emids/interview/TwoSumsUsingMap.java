package com.emids.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumsUsingMap {
	
public static int[] twoSum(int[] num,int t) {
//		
	Map<Integer,Integer> map=new HashMap<>();
 int [] output=new int[2];
//		
	for(int i=0;i<num.length;i++) {
		for(int j=i+1;j<num.length;j++) {
			if(num[i]+num[j]==t) {
				
				output[0]=num[i];
				output[1]=num[j];
			}
			}
				
	}
	return output;
}
//			}
//		}
//		
//		
//		
//	}
//	return new int[] {};
//	}
//
//		if(map.containsKey(num[i])) {
//		output[0]=map.get(num[i]);
//		output[1]=i;
//		
//		
//		}
//			map.put(t-num[i],i);
//		
//		}
//		
	
		//return output;
	
	
	
	
//	public static int fact(int n) {
//int fact=1;	
//		while(n>0) {
//	 fact=n*(fact(n-1));
//		return fact;
//	}
//		return fact;
//	}
//	for(int i=n;i>0;i--) {
//		fact=fact*i;//5*4
//	}
//	return fact;
//	}
		
	

	public static void main(String[] args) {
		int [] num= {2,7,11,15};
		int t=13;
		System.out.println(Arrays.toString(twoSum(num, t)));
		
		//System.out.println(fact(6));
	}
	}

		
	
		

