package com.evoke.oopsConcepts;

public class HierarchicalStudent {
	void display1()
	{
		System.out.println("I am a student");
	}
}
class dept extends HierarchicalStudent {
	void display2()
	{
		System.out.println("I belong to CSE");
	}
}
class sid extends HierarchicalStudent {
	void display3()
	{
		System.out.println("My id is 101");
	}
}
