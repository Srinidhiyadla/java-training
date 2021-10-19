package com.evoke.javabasics;

public class varargexample {
	public int sumNumbers(int...args) {
		System.out.println("argument length:" +args.length);
		int sum = 0;
		for(int x: args) {
			sum += x;
	}
		return sum;
	}

	public static void main(String[] args) {
		varargexample ve = new varargexample();
		int sum = ve.sumNumbers(1,2);
		System.out.println("sum ="+ sum);
		int sum1 = ve.sumNumbers(1,2,4);
		System.out.println("sum ="+ sum1);
		int sum2 = ve.sumNumbers(1,2,4,6);
		System.out.println("sum ="+ sum2);
		

	}

}
