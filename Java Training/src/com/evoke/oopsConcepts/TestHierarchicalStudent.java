package com.evoke.oopsConcepts;

public class TestHierarchicalStudent {

	public static void main(String[] args) {
		System.out.println("Calling for subclass C");
sid s = new sid();
s.display1();
s.display3();
System.out.println("Calling for subclass B");
dept d = new dept();
s.display1();
s.display1();
	}

}
