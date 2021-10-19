package com.evoke.javabasics;

public class Reference {
	 int c;
	public void method1 () {
		System.out.println(this.c);

	}
public void method2 (int a,int b) {
	
}
public int method3 () {
	return 0;
	
}
public String method4 (String name) {
	return name;
}
Reference(int a, int b) {
	this.c= a+b;
	
	
}
public static void main(String[] args) {
	Reference obj=new Reference(5,10);
	System.out.println(obj.c);
	obj.method1 ();
}
}

