package com.emids.interview;

import java.time.LocalDate;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	
	
	String firstName;
	String lastName;
	LocalDate dob;
	int age;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String firstName, String lastName, LocalDate dob,int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.age=age;
	}


	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	
	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", age=" + age + "]";
	}


	


	@Override
	public int compareTo(Employee o) {
		return lastName.compareTo(o.lastName);
	}
}



//	@Override
//	public int compareTo(Employee o) {
//		if(age==o.age) {
//			return 0;
//		}
//		else if (age<o.age) {
//			return 1;
//		}
//		else
//		
//		
//		return -1;
//	}
//	}
	
	//for sorting  Strings and wrapper class we dont have to implement this class externally by comparable inetrface,,,as String and
//wrapper class implements comparable interface internally...we ust use Collections.sort(list);
	
	
	
	
	

//public static List<Employee> decreasingDob(List emp) {
	
//	List<Employee> list=Arrays.asList("new Employee("sam","curran",1990/03/26)");
	
	//list of numbers where we need even numbers
	
//	list.stream()
//	.filter(x->x%2==0).map(n->n*n)
//	
//}
	
//public static int noOfOccurance(int[] arr) {
//	int count=0;
//	for(int i=0;i<arr.length;i++) {
//		for(int j=i+1;j<arr.length;j++) {
//			if(arr[i]==arr[j]) {
//				count++;
//				System.out.println("The number of times it has been repetaed :"+count +" the number is :"+arr[i]);
//			
//			}
//		}
//	}
//	return count;
//}
//	
//	
//	public static void main(String[] args) {
//	
//		
//int[] arr= {1,2,3,4,5,6,7,3,2,5,3,3,5,3,3,5,3,5,43,76,7};
//		
//for(int i=0;i<arr.length;i++) {
//	System.out.println(arr[i]);
//}
//noOfOccurance(arr);
//	}


