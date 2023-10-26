package com.arrays;

import java.util.Arrays;

public class ArraysClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[] {15,8,63,2,7,41,89};
		
		for(int elem:a) {
			System.out.print(elem+" ");
		}System.out.println();
		
		Arrays.fill(a,2,5,14);
		
		for(int elem:a) {
			System.out.print(elem+" ");
		}System.out.println();
		
		Arrays.sort(a);
		
		for(int elem:a) {
			System.out.print(elem+" ");
		}System.out.println();
		
		
		int key=15;
		
		System.out.println("In sorted array key="+key+" is at index="+Arrays.binarySearch(a, key));
		
		System.out.println();
		int[] a2= new int[5];
		for(int elem:a2) {
			System.out.print(elem+" ");
		}System.out.println();
		
		Arrays.fill(a2, 100);
		for(int elem:a2) {
			System.out.print(elem+" ");
		}System.out.println();
		
	}

}
