package com.evoke.ParameterPassing;

public class TestCallByRef {

	public static void main(String[] args) {
		CallByRef ob = new CallByRef(15,20);
		System.out.println("ob.a and ob.b before call:" + ob.a + " " + ob.b);
		ob.meth(ob);
		System.out.println("ob.a and ob.b after call:" + ob.a + " " + ob.b);
		}

	}


