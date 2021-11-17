package com.evoke.collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmapcollections {

	public static void main(String[] args) {
		Map<String,Integer> numbers = new HashMap<>();
		
		numbers.put("one", 1);
		numbers.put("nine", 9);
		System.out.println("Map:" + numbers);
		
		System.out.println("keys:" + numbers.keySet());
		System.out.println("values:" + numbers.values());
		System.out.println("Entries:" + numbers.entrySet());
		
		int value = numbers.remove("nine");
		System.out.println("Removed values:" +value);

	}

}
