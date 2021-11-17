package com.evoke.collections;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaExample {

	public static void main(String[] args) {
		ArrayList<Integer>my_arr = new ArrayList<Integer>();
		my_arr.add(260);
		my_arr.add(110);
		my_arr.add(6);
		my_arr.add(47);
		System.out.println("Before Sorting ArrayList:" +my_arr);
		Collections.sort(my_arr,(o1,o2) -> (o1>o2) ? -1 : (o1<o2) ? 1:0);
		System.out.println("After Sorting ArrayList:" +my_arr);

	}

}
