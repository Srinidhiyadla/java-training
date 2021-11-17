package com.evoke.strings;

public class StringBuliderExample {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("THIS IS A TEST");
		System.out.println("String = " +str.toString());
		
		StringBuilder reverseStr = str.reverse();
		System.out.println("Reverse String = " +reverseStr.toString());
		
		str.appendCodePoint(52);
		System.out.println("Modified StringBulider = " + str);
		
		int capacity = str.capacity();
		System.out.println("StringBulider = " +str);
		System.out.println("Capacity of StringBulider = " + capacity);

	}

}
