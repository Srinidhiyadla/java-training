package com.evoke.strings;

public class SbExample {
	
	public static void concat(String s) {
		s = s+ "programing";
	}
	
	public static void concat1(StringBuilder s1) {
		s1.append("programing");
	}
	
	public static void concat2(StringBuffer s2) {
		s2.append("programing");
	}

	public static void main(String[] args) {
		String s = "java";
		concat(s);
		System.out.println("String: " +s);

		StringBuilder s1 = new StringBuilder("java");
		concat1(s1);
		System.out.println("StringBuilder: " +s1);

		StringBuffer s2 = new StringBuffer("java");
		concat2(s2);
		System.out.println("StringBuffer: " +s2);
	}

}
