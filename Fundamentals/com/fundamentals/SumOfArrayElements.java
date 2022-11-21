package com.fundamentals;
import java.util.*;
public class SumOfArrayElements {
	  public static void main(String[] args){
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
			System.out.print("Given array: ");
			for (int i=0; i<n; i++)   
			{  
				System.out.print(arr[i]+" ");  
			}  
			sumArray(arr,n);
			
	  }
	  
	  public static void sumArray(int[] arr,int n){
	    int sum=0;
	    for (int i=0; i<n; i++)   
			{  
				sum = sum+arr[i]; 
			}  
			
			System.out.println("\nSum of elements of given array:"+sum);
	  }
}
