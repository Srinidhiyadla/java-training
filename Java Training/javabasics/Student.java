package com.evoke.javabasics;

import java.util.*;
public class Student {
	int stuMarks;
	public Student(int stuId, String stuName)
	{
		System.out.println("The student's Id is:" +stuId);
		System.out.println("The student's name is:" +stuName);
	}
	public void setMarks(int stmarks)
	{
		stuMarks = stmarks;
	}
public int getMarks1()
{
	System.out.println("The student's marks is:" +stuMarks);
	return stuMarks;
}
	public static void main(String[] args) {
		Student objstu = new Student(101,"Srinidhi");
		objstu.setMarks(90);
	     objstu.getMarks1();
		System.out.println("The value of variable is:" +objstu.stuMarks);
	}
}
		