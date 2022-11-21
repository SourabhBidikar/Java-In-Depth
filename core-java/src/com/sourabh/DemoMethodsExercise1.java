package com.sourabh;

import java.util.Scanner;

public class DemoMethodsExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose a number for the season:");
		System.out.println("1.spring, 2.Summer, 3.Fall, 4.Winter");
		int n= sc.nextInt();
		
		switch(n)
		{
			case 1: printSpring();
			break;
			
			case 2: printSummer();
			break;
			
			case 3: printFall();
			break;
			
			case 4: printWinter();
			break;
			
			default: System.out.println("Invalid choice");
			
		}
		

	}
	
	public static void printSpring()
	{
		System.out.println("the season is Spring");
	}
	
	public static void printSummer()
	{
		System.out.println("the season is Summer");
	}
	
	public static void printWinter()
	{
		System.out.println("the season is Winter");
	}
	
	public static void printFall()
	{
		System.out.println("the season is Fall");
	}
}


