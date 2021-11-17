package com.evoke.oopsConcepts;

abstract class Carclass {
	 abstract void run();
}
class kia extends Carclass {
	void run() {
		System.out.println("This is KIA");
	}
	public static void main(String[] args) {
		
		Carclass obj = new kia();
		obj.run();
	}

}
