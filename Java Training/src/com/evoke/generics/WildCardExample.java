package com.evoke.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {
	void draw() {
		System.out.println("Wildcard");
	}
static class rectangle extends WildCardExample {
	void draw() {
		System.out.println("Draws the rectangle");
	}
	public static void drawWildCardExample(List<?extends WildCardExample>lists) {
		for(WildCardExample w:lists) {
			w.draw();
		}
	}
	public static void main(String[] args) {
		List<rectangle>list1=new ArrayList<rectangle>();
		list1.add(new rectangle());
		drawWildCardExample(list1);
	}
}
}

