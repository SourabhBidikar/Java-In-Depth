package com.arrays;

public class ForEachEx1 {
	public static void main(String args[]) {
		
		//1D array
		int[] a1= new int[] {10,20,25,30,26};
		
		for(int elem:a1) {
			System.out.print("a1= "+elem+" ");
		}
		
		//------------------------------
		//2D Array
		int[][] a2= new int[][] {{12,15},{25,45},{10,20}};
		
		for(int[] arr: a2) {
			for(int elem:arr) {
				System.out.print("a2= "+elem+" ");
			}
		}
		//------------------------------
		//3D Array
		int[][][] a3= new int[][][] {{{10,20,30},{2,4,6},{1,3,7}},{{8,5,9},{9,5,8}}};
		
		for(int[][] m:a3) {
			for(int[] n:m) {
				for(int elem:n) {
					System.out.print("a3= "+elem+" ");
				}
			}
		}
	}
}
