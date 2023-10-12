package com.arrays;

import java.util.Scanner;

public class MaxandMin {

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
		
		int max=a[0];
		for(int elem:a) {
			if(max<elem) {
				max=elem;
			}
		}
		
		System.out.println("max in array is : "+max);
		
		
		int min=a[0];
		for(int elem:a) {
			if(min>elem) {
				min=elem;
			}
		}
		
		
		
		System.out.println("min in array is : "+min);
		

	}

}
