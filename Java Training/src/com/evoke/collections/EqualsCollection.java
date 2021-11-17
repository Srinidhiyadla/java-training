package com.evoke.collections;

import java.util.Collection;
import java.util.HashSet;

public class EqualsCollection {
	static int a=6;

	public static void main(String[] args) {
		
		Collection<Integer>collection = new HashSet<>();
		Collection<Integer>collection1 = new HashSet<>();
		
		collection.add(6);
		collection1.add(6);
		
		boolean val = collection.equals(collection1);
		System.out.println(val);
		
		
	}

}
