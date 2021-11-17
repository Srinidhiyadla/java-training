package com.evoke.oopsConcepts;

public interface DefaultHexagonInterface {
void getarea();
default void getsides() {
	System.out.println("can i get sides of the Hexagon");
}
}
	class rectangle implements DefaultHexagonInterface {
		public void getarea() {
			int length = 6;
			int breadth = 4;
			int area = length*breadth;
			System.out.println(" area of the rectangle is" +area);
		}
	public void getsides1() {
		System.out.println("I have 4 sides.");
	}
	class square implements DefaultHexagonInterface {
		public void getarea() {
			int length = 6;
			int area = length*length;
			System.out.println(" area of the Square is" +area);
		}
}
	}