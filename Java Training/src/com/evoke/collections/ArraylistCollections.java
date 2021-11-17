package com.evoke.collections;

import java.util.List;
import java.util.ArrayList;
public class ArraylistCollections {

	public static void main(String[] args) {
		List<Integer>numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("Contents of numbers:" +numbers);
		
		int number = numbers.get(2);
		System.out.println("Accessed element:" +number);
		
		int removednumber = numbers.remove(1);
		System.out.println("removed element:" +removednumber);
		
	}

}
