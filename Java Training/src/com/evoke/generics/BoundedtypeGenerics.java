package com.evoke.generics;

public class BoundedtypeGenerics {

		public static  < T extends Comparable <T>> T maximum(T x,T y,T z) { 
			T max = x;
			if(y.compareTo(max) > 0 ) {
				max = y;
			}
			if(z.compareTo(max) > 0 ) {
				max = z;
			}
			return max;
		}
		public static void main(String[] args) {
			
			System.out.printf("max of %d,%d and %d is %d\n\n", 1,2,3, maximum(1,2,3));
			System.out.printf("max of %.1f,%.1f and %.1f is %.1f\n\n", 1.1,2.2,3.3, maximum(1.1,2.2,3.3));
			System.out.printf("max of %s,%s and %s is %s\n", "Rose","Jasmine","Sunflower", maximum( "Rose","Jasmine","Sunflower"));
		}


}
