package com.evoke.arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int[] num = {2,4,8,10};
		int tofind = 6;
		boolean found = false;
		
		for(int n : num) {
			if(n == tofind) {
				found = true;
				break;
			}
		}
		if(found)
			System.out.println(tofind + "is found.");
		else
			System.out.println(tofind + "is not found.");
	}

}
