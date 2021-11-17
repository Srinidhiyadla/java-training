package com.evoke.collections;

import java.util.ArrayList;
import java.util.Collections;


public class TestEmployeeCompartor {

	public static void main(String[] args) {
		ArrayList<EmployeeComparator> ar = new ArrayList<EmployeeComparator>();
		ar.add(new EmployeeComparator(248,"xyz","vizag"));
		ar.add(new EmployeeComparator(212,"abc","Hyderabad"));
		ar.add(new EmployeeComparator(260,"pqr","jaipur"));
		
		
	System.out.println("unsorted");
	for(EmployeeComparator obj : ar) {
		System.out.println(obj.ID+" "+ obj.name + " " + obj.address);
	}
	SortbyName sn = new SortbyName();
	Collections.sort(ar,sn);
	System.out.println("Sorted by ID");
	for(EmployeeComparator obj : ar) {
		System.out.println(obj.ID+" "+ obj.name + " " + obj.address);
	}
	

	}

}
