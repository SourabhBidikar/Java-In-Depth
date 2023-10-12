package com.arrays;

public class ExClassofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//As array is object, there must be some class associated with it because of which 
		//we are able to create the object so we see it in this example.
		
		int[] a= new int[5];
		
		System.out.println(a.getClass().getName());   //[I
		
		
		char[] c= new char[12];
		System.out.println(c.getClass().getName());   //[C
		
		
		int[][] a2= new int[5][];
		
		System.out.println(a2.getClass().getName());  //[[I
	}

}
