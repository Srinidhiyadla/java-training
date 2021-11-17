package com.evoke.collections;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollections {

	public static void main(String[] args) {
Map<String,Integer> values = new TreeMap<>();
		
		values.put("six", 6);
		values.put("nine", 9);
		System.out.println("TreeMap:" + values);
		
		values.replace("nine", 99);
		values.replace("six", 66);
		System.out.println("new map:" +	values);
		
		int removedvalue = 	values.remove("nine");
		System.out.println("Removed values:" +removedvalue);


	}

}
