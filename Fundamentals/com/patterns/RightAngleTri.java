package com.patterns;

import java.util.Scanner;

public class RightAngleTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i = 0;i<=n;i++) {
			for(int j=0;j<i;j++) {
			System.out.print("*");
			
			}
			System.out.println();
		}

	}

}
