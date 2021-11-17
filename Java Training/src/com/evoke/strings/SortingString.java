package com.evoke.strings;

import java.util.Arrays;

import com.evoke.arrays.Array;

public class SortingString {

	public static String sortString(String inputString) {
		char tempArray[] = inputString.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}
public static void main(String[] args) {
	String inputString = "evoketechnologies";
	String outstring = sortString(inputString);
	System.out.println("input String: " + inputString);
	System.out.println("output String " + outstring);
}
}
