package com.evoke.generics;

import java.util.Arrays;
import java.util.List;


public class UpperBoundWildCard {

	public static void main(String[] args) {
		List<Integer>list1= Arrays.asList(1,2,3,4,5);
System.out.println("Total sum :" +sum(list1));

List<Double>list2= Arrays.asList(1.1,2.2,3.4,4.5,5.6);
System.out.println("Total sum :" +sum(list2));

	}
private static double sum(List<? extends Number> list)
{
	double sum = 0.0;
	for(Number i : list) {
		sum+=i.doubleValue();
	}
	return sum;
}
}
