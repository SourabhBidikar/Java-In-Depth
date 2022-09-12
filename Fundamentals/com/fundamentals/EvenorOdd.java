package com.fundamentals;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to check:");
		int n=sc.nextInt();
		if(evenOrOdd(n)) System.out.println(n+" is even");
		else System.out.println(n+" is odd");
		

	}
	
	public static boolean evenOrOdd(int n) {
		
		if(n%2==0)return true;
		return false;
	}

}
