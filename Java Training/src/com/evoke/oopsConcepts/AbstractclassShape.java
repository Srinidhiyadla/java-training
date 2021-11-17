package com.evoke.oopsConcepts;

 abstract class AbstractclassShape {
	abstract void draw();
}

class Square extends AbstractclassShape {
	void draw() {
		System.out.println("drawing square");
	}
	class circle1 extends AbstractclassShape {
		void draw() {
			System.out.println("drawing circle");
		}
		
}
}