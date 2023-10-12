package com.arrays;

import java.util.Scanner;

public class SumOfArrayElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("give array size: ");
		int size=sc.nextInt();
		
		int[] a= new int[size];
		
		System.out.println("Enter array elems: ");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int elem:a) {
			sum+=elem;
		}
		
		System.out.println("Sum of array elements: "+sum);

	}

}
