package com.xworkz.apptitude;

public class TripletsArrays {
	public static void main(String[] args) {
		

	
	int[] num= {1,2,3,4,5};
	
	int n=9;
	
	int count=0;
	for(int i=0;i<num.length;i++) {
		for(int j=i+1;j<num.length;j++) {
			for(int k=j+1;k<num.length;k++) {
			if(num[i]+num[j]+num[k]==n) {
				
				++count;
				
				System.out.println(num[i]+" "+num[j]+" "+num[k] +" "+"the total numbers are: "+count);
			}
			}
		}
	}

}
}