package com.evoke.oopsConcepts;

public class TestVehicleOopsConcept {

	public static void main(String[] args) {
		VehicleOopsConcept v = new VehicleOopsConcept();
		v.display();
		car c = new car();
		c.display();
		System.out.println(c.add(1,2));
		System.out.println(c.add(4,3));
		v=c;
		v.display();
	}
	
	}


