package com.evoke.oopsConcepts;

public class MethodOverloadingDataType {

	private static void display(int a) {
		System.out.println("Integer data type");
	}
	private static void display(String a) {
		System.out.println("String data type");
	}
	public static void main(String[] args) {
		display(1);
		display("hello");

	}

}
