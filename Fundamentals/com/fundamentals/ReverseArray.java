package com.fundamentals;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//take array size as input
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int[] arr= new int[n];
		//input array elements
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//print original array
		System.out.println("original array: ");
		for (int i=0; i<n; i++)   
		{  
			System.out.print(arr[i]+" ");  
		}  
		
		int[] rev = new int[n];
		
		int j=n-1;
		//reverse array and store in rev
		for(int i=0;i<n;i++) {
			rev[j]=arr[i];
			j--;
		}
		//print reversed array
		System.out.println("\nReversed array: ");
		for (int i=0; i<n; i++)   
		{  
			System.out.print(rev[i]+" ");  
		}  
		
	}

}
