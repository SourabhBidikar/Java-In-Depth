package com.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandEx7 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int[] ar;
		try {
			System.out.println("enter size of array:");
			int size= scan.nextInt();
			ar= new int[size];   
			//if we give size in negative "nagativeArrayIndexException" will occur
			
		}
		//here we have handled exception for ArithmeticException instead of negative array index 
		//so matter will go to DEH with abrupt termination but also finally block will execute
		catch(ArithmeticException ae) {
			
		}
		finally {
			System.out.println("Inside finally");
		}
		
		System.out.println("outside finally");

	}

}
