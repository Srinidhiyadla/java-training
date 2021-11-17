package com.evoke.strings;

public class IndexOfString {

	public static void main(String[] args) {
		String str1 = "Java String";
		int result;
		
		result = str1.indexOf('J');
		System.out.println(result);

		result = str1.indexOf('S');
		System.out.println(result);
		
		result = str1.indexOf("tri");
		System.out.println(result);
		
		result = str1.indexOf('b');
		System.out.println(result);
		
		result = str1.indexOf("String");
		System.out.println(result);
		
		result = str1.indexOf(" ");
		System.out.println(result);
		
	}

}
