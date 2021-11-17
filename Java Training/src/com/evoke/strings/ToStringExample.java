package com.evoke.strings;

public class ToStringExample {

	public static void main(String[] args) {
		Student s1 = new Student(247,"Sai","Hyderabad");
		Student s2 = new Student(212,"jimin","vizag");
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
class Student {
	int rollno;
	String name;
	String city;
	
	Student(int rollno,String name,String city) {
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
public String toString() {
	return rollno+ " "+name+" "+city;
}
}