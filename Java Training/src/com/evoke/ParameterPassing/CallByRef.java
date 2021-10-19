package com.evoke.ParameterPassing;

public class CallByRef {
	int a,b;
	 CallByRef(int i,int j) {
		 a = i;
		 b = j;
	 }
	void meth( CallByRef o) {
		o.a *= 2;
		o.b /= 2;
	}

}
