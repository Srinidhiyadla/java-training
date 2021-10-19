package com.evoke.Method;

public class TestOverLoad {
	
		public static void main(String[] args) {
			OverloadDemo ob = new OverloadDemo ();
			double result;
			ob.test();
			ob.test(10);
			ob.test(10,20);
			result = ob.test(123.2);
			System.out.println("Result of ob.test(123.2):" + result);
		}

}
