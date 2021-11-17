package com.evoke.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollections {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(1);
		set1.add(3);
		System.out.println("set1:" +set1);
		Set<Integer> set2 = new HashSet<>();
		
		set2.add(1);
		set2.add(2);
		System.out.println("set2:" +set2);
		set2.addAll(set1);
		System.out.println("union is:" +set2);
	}

}
