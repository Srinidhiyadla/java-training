package com.evoke.oopsConcepts;

public class BaseClassOverriding {
	void display()
	{
		System.out.println("Hello");
	}
}
class Derivedclass extends BaseClassOverriding {
	void display()
	{
		System.out.println("Welcome");
	}
}

