package com.evoke.oopsConcepts;

public class TestEncapsulationExample {

	public static void main(String[] args) {
		EncapsulationExample obj = new EncapsulationExample();
		obj.setStdId(247);
		obj.setStdName("Srinidhi");
		obj.setStdBranch("EEE");
		System.out.println("Student Id: " +obj.getStdId());
		System.out.println("Student Name: " +obj.getStdName());
		System.out.println("Student Branch: " +obj.getStdBranch());
	}
		
	}


