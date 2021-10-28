package com.evoke.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayExample {
	int id;
	String name;
	double salary;
	
	
	@Override
	public String toString() {
		return "SortArrayExample [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public SortArrayExample(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		int[] myarray = {10,30,20,50,40};
		System.out.println("Before sorting => " + Arrays.toString(myarray));
		Arrays.sort(myarray);
		System.out.println("After sorting => " + Arrays.toString(myarray));
		Arrays.sort(myarray);


String[] strArray = {"B","D","A","C","E"};
System.out.println("Before sorting => " + Arrays.toString(strArray));
System.out.print("reverse order : [");
for(int i=strArray.length-1;i<strArray.length&&i>=0;i--) {
	System.out.print(strArray[i]+",");
}
System.out.println("]");
SortArrayExample employee=new SortArrayExample(10,"sfsf",58.5);
SortArrayExample employee1=new SortArrayExample(10,"sfsf",58.5);
SortArrayExample employee2=new SortArrayExample(10,"sfsf",58.5);
System.out.println(employee);
	}
}
