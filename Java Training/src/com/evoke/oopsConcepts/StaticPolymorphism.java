package com.evoke.oopsConcepts;

public class StaticPolymorphism {
public void show(int a) {
	System.out.println("Area of Square=" +a*a);
}
public void show(int a,int b) {
	System.out.println("Area of rectangle=" +a*b);
}
	public static void main(String[] args) {
		StaticPolymorphism sp = new StaticPolymorphism();
		sp.show(3);
		sp.show(6,8);

	}

}
