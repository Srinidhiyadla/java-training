package com.evoke.strings;

public class RevIterationString {

	public static String reverseString(String s) {
	char c[] = s.toCharArray();
	String reverse= " ";
	for(int i=c.length-1;i>=0;i--) {
		reverse+=c[i];
	}
return reverse;
	}
	public static void main(String[] args) {
		System.out.println( reverseString("Hello"));
		System.out.println( reverseString("Reverse Iteration"));
	}
}
