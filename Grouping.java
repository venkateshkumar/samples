package com.dxb;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * @author Venkateshkumar S
 *
 */
public class Grouping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Vehicle> lstVehicles =new ArrayList<>();
		// Addition of test data for car and lorry
		for(int i=0;i<10;i++) {
			lstVehicles.add(new Vehicle("2009"+i,"Car","M800"));
		}
		
		for(int i=0;i<10;i++) {
			lstVehicles.add(new Vehicle("2009"+i,"Lorry","AL00"));
		}
		
		// Group by Model
		Map <Object, Long> byCategory = lstVehicles.stream()
                .collect(Collectors.groupingBy(p -> p.getCategory(), Collectors.counting()));
		
		// Group by Year
		Map <Object, Long> byYear = lstVehicles.stream()
                .collect(Collectors.groupingBy(p -> p.getYear(), Collectors.counting()));
		System.out.println("********* MODEL **************");
		System.out.println(byCategory);
		System.out.println("********* YEAR **************");
		System.out.println(byYear);
		

	}

	
}
