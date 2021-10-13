package com.evoke.Method;

public class MethodReturn {
	public static int square(int num) {
		return num * num;
	}

	public static void main(String[] args) {
		int result;
		result = square(10);
		System.out.println("square value of 10 is:" + result);

	}

}
