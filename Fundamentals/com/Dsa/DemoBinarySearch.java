package com.Dsa;

import java.util.Arrays;
import java.util.Scanner;

public class DemoBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements you want to enter:\n");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter "+n+ " sorted numbers :");
		for(int a=0;a<n;a++) {
			arr[a]=sc.nextInt();
		}
		System.out.println("you entered:");
		for(int a=0;a<n;a++) {
			System.out.print(" "+arr[a]);
		}
		System.out.println("\nenter key to search:");
		int key=sc.nextInt();
		int i= binarySearch(arr,key,n);
		
		if(i==-1) System.out.println("number not found");
		else{
			System.out.println(key+" is at "+(i+1)+" position.");
		}
	}


	static int binarySearch(int arr[],int key,int n) {
		
		int low=0;
		int high=n-1;
		int mid=(low+high)/2;
		
		while(low<=high)
		{
			
			if(arr[mid]==key) {
				return mid;
			}
			else if (arr[mid]<=key) {
			
				low=mid+1;
			}
			else {
		
				high=mid-1;
			}
			 mid=(low+high)/2;
		}
		return -1;
	}

}