package com.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandEx8 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		try{
			System.out.println("Enter a:");
			int a=scan.nextInt();
			System.out.println("Enter b:");
			int b=scan.nextInt();
			int c=a/b;
		}
		catch(Exception e) {
			System.out.println("---------------------------------");
			System.out.println(e.toString());
			System.out.println("---------------------------------");
			System.out.println(e.getMessage());
			System.out.println("---------------------------------");
			e.printStackTrace();
		}
		finally {
			System.out.println("Close connection");
		}

	}

}
