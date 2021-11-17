package com.evoke.strings;

public class StringDataTypes {

	public static void main(String[] args) {
		String s = "6";
		String s2 = "19.7";	
		String trueString = "true";
		String s3 = "hello";
		String s4 = "7658980654";
		int i = Integer.valueOf(s);
		float f = Float.parseFloat("19.7");
		boolean truebool = Boolean.valueOf(trueString);
		char c =s3.charAt(0);
		long l = Long.parseLong(s);
		System.out.println(i);
		System.out.println(f);
		System.out.println(truebool);
		System.out.println("1st character is: " +c);
		System.out.println(s4);

	}

}
