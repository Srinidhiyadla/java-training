package com.evoke.collections;

import java.util.Collection;
import java.util.HashSet;

public class HashcodeCollections {

	public static void main(String[] args) {
Collection<String>collection = new HashSet<>();
		
		collection.add("Hashcode");
		collection.add("Collection");
		
		int val = collection.hashCode();
		System.out.println("hashcode:" +val);
		
		
	}


	}

