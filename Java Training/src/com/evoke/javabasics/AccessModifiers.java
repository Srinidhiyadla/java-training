package com.evoke.javabasics;

public class AccessModifiers {
	int p;
	public int q;
	private int r;
	void setr(int x)
	{
		r=x;
	}
	int getr()
	{
		return r;
	}
	public static void main(String[] args) {
		AccessModifiers object = new AccessModifiers();
		object.p = 20;
		object.q=30;
		object.setr(200);
		System.out.println("the value of p,q & r is "+object.p+" "+object.q+" "+object.getr());
	}

}
