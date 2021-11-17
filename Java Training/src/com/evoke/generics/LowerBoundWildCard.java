package com.evoke.generics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundWildCard {

	public static void main(String[] args) {
			List<Integer>list1= Arrays.asList(1,2,3,4,5);
			printOnlyIntegerClassorSuperclass(list1);

	List<Number>list2= Arrays.asList(4,5,6,7,8);
	printOnlyIntegerClassorSuperclass(list2);

		}
	
public static void printOnlyIntegerClassorSuperclass(List<? super Integer> list2)
	{
		System.out.println(list2);
	}

}
