package com.arrays;

import java.util.Scanner;

public class Array2DEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example of marks of 3 classes containing 4 students each.
		Scanner sc = new Scanner(System.in);
		int[][] ar= new int[2][2];
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.println("Enter marks for class: "+i+" student: "+j);
				ar[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.println("Marks for class: "+i+" student: "+j+"="+ar[i][j]);				
			}
		}
	}
}
