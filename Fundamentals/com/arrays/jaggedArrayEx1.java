package com.arrays;

public class jaggedArrayEx1 {
	public static void main(String args[]) {
		
		/*
		 * multidimensional array where in the member arrays can be different sizes is
		 * called jagged arrays.
		 */
		
		
		int[][] arr= new int[3][];
		
		arr[0]= new int[4];
		arr[1]= new int[3];
		arr[2]= new int[5];
		
		
		arr[0][0]=1;
		
		System.out.println(arr[0][0]);
		
	}

}
