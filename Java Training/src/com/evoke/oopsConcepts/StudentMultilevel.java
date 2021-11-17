package com.evoke.oopsConcepts;

public class StudentMultilevel {
String sname = "Sai";
int sid = 101;
}
class Department extends StudentMultilevel
{
	String dept = "CSE";
}
class Marks extends Department {
	int sub1=50,sub2=80;
	void total() {
		int  total = sub1+sub2;
	}
	void display() {
		System.out.println("student name: " +sname + "\n student id: " +sid+ "\n department: " +dept+"\n marks of subject1: " +sub1+"\n marks of subject2: " +sub2);
	}
	}
