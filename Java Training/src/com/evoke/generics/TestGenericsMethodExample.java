package com.evoke.generics;

public class TestGenericsMethodExample {

	public static void main(String[] args) {
		TestGenericsMethodExample demo = new TestGenericsMethodExample();
		 demo.<String>genericsMethod("Java Programming");
		demo.<Integer>genericsMethod(19);
	}

	public<T> void genericsMethod(T data) {
		System.out.println("Generics Method:");
		System.out.println("Data passed:" +data);
	}

}
