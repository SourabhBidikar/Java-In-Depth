package com.sourabh;
import java.util.Scanner;

public class DemoMethodsParams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter marks of 3 subjets:");
		Scanner sc= new Scanner(System.in);
		double marks1 = sc.nextDouble();
		double marks2 = sc.nextDouble();
		double marks3 = sc.nextDouble();
		
		Double average= findAverage(marks1,marks2,marks3);
		System.out.println("average is  "+average);
	}
	
	public static double findAverage(double a, double b, double c)
	{
		return (a+b+c)/3.0;
	}
}
