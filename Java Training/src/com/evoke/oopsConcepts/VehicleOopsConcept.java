package com.evoke.oopsConcepts;


public class VehicleOopsConcept {
	public void display() {
		System.out.println("VehicleOopsConcept");
	}
}
class car extends VehicleOopsConcept {
	public void display() {
		System.out.println("override subclass of car");
}
	public int add(int a,int b) {
		return a+b;
	}
	public  double add(double a,double b) {
		return a+b;
	}
}
