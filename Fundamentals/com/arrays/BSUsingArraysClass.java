package com.arrays;

import java.util.Arrays;

public class BSUsingArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[] {15,8,63,2,7,41,89};
		int key=63;
		
		System.out.println("key is at index: "+Arrays.binarySearch(a,key));
		
	}
	

	

}
