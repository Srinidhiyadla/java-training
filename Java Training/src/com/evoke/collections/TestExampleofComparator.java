package com.evoke.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TestExampleofComparator {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("a");
		ts.add("c");
		ts.add("b");
		ts.add("e");
		ts.add("d");
		
		Iterator i = ts.iterator();
		while(i.hasNext()) {
			Object element = i.next();
			System.out.println(element + " ");
			
		}
		
System.out.println();
	}

}
