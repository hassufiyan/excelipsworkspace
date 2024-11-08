package com.emids.interview;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainEmployee {

	public static void main(String[] args) {
		
	List<Employee> list=new ArrayList<Employee>();
	
	//SimpleDateFormat sdf=new SimpleDateFormat("yyyy/mm/dd");
//	
	list.add(new Employee("sam", "Roy", LocalDate.of(1990, 12, 30), 29));
	list.add(new Employee("Jason", "Curran", LocalDate.of(1982, 06, 9),31));
	list.add(new Employee("Andrew", "Flintoff", LocalDate.of(1976, 03, 10),49));
	
	Collections.sort(list);
	
	for (Employee employee : list) {
		System.out.println(employee);
	}
	

	
//Collections.sort(list, new Comparator<Employee>() {
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		
//		return o1.getDob().compareTo(o2.getDob());
//	}
//});	
//
//for(Employee newList:list) {
//	
//	System.out.println(newList);
//	
//}

		
		//Sorting using streamApi----------------------------------------------------------------------------
		List<Integer> num=Arrays.asList(1,10,9,20,32);
//		
	
	num.sort(null);
	System.out.println(num);
//	
//	Collections.reverseOrder();
//		
//	}

}
}
