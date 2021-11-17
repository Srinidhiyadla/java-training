package com.evoke.generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCard {

	public static void main(String[] args) {
		List<Integer>list1= Arrays.asList(1,2,3);

		List<Double>list2=Arrays.asList(1.1,2.2,3.4,4.5);
		
		printlist(list1);
		printlist(list2);

			}
		private static void printlist(List<?> list)
		{
			System.out.println(list);
	}

}
