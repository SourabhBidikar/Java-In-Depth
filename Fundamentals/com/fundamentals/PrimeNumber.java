package com.fundamentals;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				try {
					Scanner sc=new Scanner(System.in);
					System.out.println("enter number to check:");
					int n=sc.nextInt();
					if(isPrime(n)) System.out.println(n+" is prime");
					else System.out.println(n+" is not prime");
				} 
				
				catch (Exception e) {
					
					System.err.println("Enter only natural numbers, your input giving below errors");
					e.printStackTrace();
					
				}
				

	}
			
	public static boolean isPrime(int n) {
		if(n==0||n==1) return false;
				
		else if(n==2) return true;
				
		for(int i=3;i<(n/2);i++) {
			if(n%i==0) return false;					
		}
		return true;
				
	}

		
}