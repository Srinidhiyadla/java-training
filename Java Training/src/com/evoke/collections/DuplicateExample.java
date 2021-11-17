package com.evoke.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateExample {
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
		Set<T> set = new LinkedHashSet<>();
		set.addAll(list);
		list.clear();
		list.addAll(set);
		return list;
	}

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,6,9,1,3,7,8,10,1,4,10));
		System.out.println("Duplicates Arraylist:" +list);
		ArrayList<Integer>newList = removeDuplicates(list);
		System.out.println(" removed Duplicates Arraylist:" +newList);
		

	}

}
