package com.evoke.generics;

public class SingleGenericMethod {
	public static  < E > void printarray (E[] InputArray) {
		for(E element: InputArray) {
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray = {5, 4 , 3 , 2 , 1};
		Double[] doubleArray = {5.5, 4.4 , 3.3 , 2.2 , 1.1};
		Character[] charArray = {'G','e','n','e','r','i','c','s'};
		
		System.out.println("Array integerArray contains:");
		printarray(intArray);
		System.out.println("\nArray doubleArray contains:");
		printarray(doubleArray);
		System.out.println("\nArray charArray contains:");
		printarray(charArray);
	}

}

