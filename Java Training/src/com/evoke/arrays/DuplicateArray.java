package com.evoke.arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int nums[] = {10,20,30,40,50,50,60};
		System.out.println("Original length array:" +nums.length);
System.out.print("Elements of arrays:");
for(int i=0;i<nums.length;i++)
{
	System.out.print(nums[i]+" ");
}
System.out.println("\nThe new length of the array is: "+array_sort(nums));

	}
	public static int array_sort(int[] nums) {
		int index = 1;
		for(int i = 1; i < nums.length;i++) {
			if(nums[i] !=nums[index-1])
				nums[index++] = nums[i];
		}
		return index;
	}

}
