package com.arrays;

public class ArrayEx1 {
	public static void main(String args[]) {
		int n=10;
		
		int a[]= new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=i+5;
		}
		
		System.out.print("a= ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+", ");
		}
	}

}
