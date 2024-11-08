package com.emids.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingTriplets {

	public static List<int[]> threeSums(int[] a){
		
		List<int[]> list=new ArrayList<int[]>();
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
				if(a[i]+a[j]+a[k]==0) {
				int[] newArray=new int[3];
				
				newArray[0]=a[i];
				newArray[1]=a[j];
				newArray[2]=a[k];
				
				list.add(newArray);
				}
					
				}
			}
		}
		
		return list;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr= {-1, 0, 1, 2, -1, -4};
		List<int[]> input =threeSums(arr);
		
		
		
		for(int[] i:input) {
			System.out.println(Arrays.toString(i));
		}

	}

}
