package com.evoke.Method;

public class MethodName {
	public int addNumbers(int a,int b) {
		int sum = a+b;
		return sum;
	}
	public static void main(String[] args) {
	int num1 = 22;
	int num2 = 16;
	MethodName obj = new MethodName();
	int result = obj.addNumbers(num1,num2);
	System.out.println("sum is:" +result);

	}

}
