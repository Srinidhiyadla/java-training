package com.evoke.strings;

public class ReplaceSB {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This is a test.");
		sb.replace(1, 6, "was");
		System.out.println("After Replace:" +sb);
		}

	}
