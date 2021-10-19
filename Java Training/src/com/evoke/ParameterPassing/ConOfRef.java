package com.evoke.ParameterPassing;

public class ConOfRef
{
	int a = 5;
	int b = 7;
	int sum(int c,int d) {
		int e = c+d;
		return e;
	}
	void add (int f,int g) {
		System.out.println("sum="+(f+g));
	}
	}
class ConOfRef1
{
	public static void main(String[] args) 
	{
		ConOfRef ob = new ConOfRef();
		int h = ob.sum(15,10);
		System.out.println("sum="+h);
		ob.add(ob.a,ob.b);
	}

}
