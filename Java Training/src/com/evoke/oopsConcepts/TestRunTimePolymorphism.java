package com.evoke.oopsConcepts;

public class TestRunTimePolymorphism {

	public static void main(String[] args) {
		RunTimePolymorphism R = new Mango();
		R.good();
		Mango m = new Mango();
		R=m;
		
	}

}
