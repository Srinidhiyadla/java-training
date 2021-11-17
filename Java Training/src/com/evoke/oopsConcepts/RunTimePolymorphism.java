package com.evoke.oopsConcepts;

public abstract class RunTimePolymorphism {
	public abstract void good();
	{
		System.out.println("Fruits are good for health.");
	}
}
class Mango extends RunTimePolymorphism {
	public void good() {
		System.out.println("There are some fruits like mangoes which are available in summer season");
	}
class Strawberry extends RunTimePolymorphism {
	public void good() {
		System.out.println("There are some fruits like Strawberry which are available in raining season");
	}
class Orange extends RunTimePolymorphism {
	public void good() {
		System.out.println("There are some fruits like orange which are available in all season");
	}
}
}	
}