package com.evoke.arrays;
import java.util.Scanner;
public class UserdefinedArray {

	public static void main(String[] args) {
		int length;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store:");
length = input.nextInt();

String[] names = new String[length];

for(int counter = 0; counter < length; counter++) {
	System.out.println("Enter the elements of the array" + (counter+1));
	names[counter] = input.next();
}
input.close();
System.out.println("Array Elements are");
for(int counter = 0;counter<length;counter++) {
	System.out.println(names[counter]);
}
	}

}
