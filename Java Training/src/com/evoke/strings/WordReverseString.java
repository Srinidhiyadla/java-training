package com.evoke.strings;

import java.util.Scanner;

public class WordReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Original String:");
		
		String OriginalStr = scanner.nextLine();
		scanner.close();
		
		String words[] = OriginalStr.split("\\s");
		String reversedString=" ";
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String reverseword = "";
			for(int j= word.length() -1;j>=0;j--) {
				 reverseword = reverseword + word.charAt(j);
			}
reversedString = reversedString + reverseword + " ";
	}
System.out.println("Reversed string :" + reversedString);
}
}
