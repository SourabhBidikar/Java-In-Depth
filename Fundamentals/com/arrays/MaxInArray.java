package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		int[] ar= new int[n];
		System.out.println("Enter array Elements: ");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Given array is: ");
		for(int elem:ar) {
			System.out.print(elem+" ");
		}
		
		System.out.println("\nMax in array using simple logic is "+findMax(ar));
		
		System.out.println("\nMax in array using \"Arrays\" class's sort method is "+findMax2(ar));
		
		
		
	}
	static int findMax(int a[]) {
		
		int max = Integer.MIN_VALUE; /*
										 * int max=0; also okay for this problem but above provides the minimum posible
										 * integer value.
										 */
		  
		  for(int elem:a) { if(max<elem) { max=elem; }
		  
		  }return max;
		
	}
	
	
	//Using "Arrays" class methods
	
	static int findMax2(int a[]) {
		Arrays.sort(a);
		return a[a.length-1];
	}

}
