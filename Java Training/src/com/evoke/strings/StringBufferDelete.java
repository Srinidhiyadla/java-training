package com.evoke.strings;

public class StringBufferDelete {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This is a test.");
		sb.delete(4,7);
		System.out.println("After Delete:" +sb);

	}

}
