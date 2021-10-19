package com.evoke.constructors;

public class Constructor {
int x;
		Constructor(int i) {
			x=i;
		}
	

	public static void main(String[] args) {
		Constructor a = new Constructor(10);
		Constructor b = new Constructor(20);
		System.out.println(a.x+" "+b.x);
}
}