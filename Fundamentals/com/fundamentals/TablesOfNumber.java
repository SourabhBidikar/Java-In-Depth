package com.fundamentals;

import java.util.Scanner;

public class TablesOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printTable(n);

	}
	
	public static void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+" = "+n*i);
		}
	}

}
