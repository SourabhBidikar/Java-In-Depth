package com.fundamentals;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to find its factorial:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Factorial of n is: "+printFactorial(n));
		
	}
		
		
	public static int printFactorial(int n) {
			int factorial=1;
			for(int i=n;i>=1;i--)
			{
				factorial=factorial*i;
			}
			return factorial;
			
	}

}
