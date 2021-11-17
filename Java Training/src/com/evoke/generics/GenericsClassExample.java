package com.evoke.generics;

public class GenericsClassExample {

	public static void main(String[] args) {
		GenericsClass<Integer>intobj = new GenericsClass<>(6);
		System.out.println("Generics class returns:" +intobj.getData());
		
		GenericsClass<String>stringobj = new GenericsClass<>("generics");
		System.out.println("Generics class returns:" +stringobj.getData());
	}

}
class GenericsClass<T> {
	private T data;
	public GenericsClass(T data) {
		this.data = data;
	}
	public T getData() {
		return this.data;
	}
}