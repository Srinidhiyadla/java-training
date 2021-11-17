package com.evoke.strings;

public class OccuranceOfString {

	static int OccuranceOfString(String str,String word)
	{
		String a[] = str.split(" ");
		int count = 0;
		for(int i=0;i< a.length;i++) {
			if(word.equals(a[i]))
				count ++;
		}
		return count;
	}
	public static void main(String[] args) {
		String str = "This is java program";
		String word = "java";
		System.out.println(OccuranceOfString(str,word));

	}

}
