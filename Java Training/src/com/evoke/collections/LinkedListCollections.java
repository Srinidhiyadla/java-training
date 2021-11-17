package com.evoke.collections;

import java.util.LinkedList;
import java.util.List;

public final class LinkedListCollections {

	public static void main(String[] args) {
List<Integer>numbers = new LinkedList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("Contents of numbers:" +numbers);
		
		int number = numbers.get(2);
		System.out.println("Accessed element:" +number);
		
		int index = numbers.indexOf(2);
		System.out.println("Position of 3 is" +index);
		
		int removednumber = numbers.remove(1);
		System.out.println("removed element:" +removednumber);
		
	}



	}


