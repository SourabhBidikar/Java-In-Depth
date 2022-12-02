package com.Dsa;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int key=4;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==key) 
			System.out.println(key+" found at "+(i+1)+" position.");
		}

	}

}
