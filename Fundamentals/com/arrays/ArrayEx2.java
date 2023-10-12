package com.arrays;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int[] ar= new int[5];
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter marks for student "+(i+1));
			ar[i]=sc.nextInt();
		}
		
		
		System.out.println("You Entered marks are: ");
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>35) {
			System.out.println("marks of student " +(i+1)+" "+ar[i]+" Result is PASS");
			}
			else {
				System.out.println("marks of student " +(i+1)+" "+ar[i]+" Result is FAIL, student failed by "+(35-ar[i])+" marks");
			}
		}
		
		
	}
	

}
