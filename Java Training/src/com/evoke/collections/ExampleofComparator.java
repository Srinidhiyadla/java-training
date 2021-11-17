package com.evoke.collections;

import java.util.Comparator;

public abstract class ExampleofComparator implements Comparator{
	public int compare(Object a, Object b) {
		String astr,bstr;
		astr = (String) a;
		bstr = (String) b;
		return bstr.compareTo(astr);
	}
}
	