package com.fundamentals;
import java.util.*;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose 1.Add 2.Multiply");
		Scanner sc= new Scanner(System.in);
		int ch=sc.nextInt();
		System.out.println("Enter two numbers");
	
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(ch==1)System.out.println("Sum = "+AddTwoNumbers(a,b));
		else System.out.println("Sum = "+MultiplyTwoNumbers(a,b));
	}
	
	public static int AddTwoNumbers(int a, int b) {
		return a+b;
	}
	
	public static int MultiplyTwoNumbers(int a, int b) {
		return a*b;
	}
	
	/*
	public static int AddTwoNumbers(int a, int b) {
		return a+b;
	}
	
	public static int AddTwoNumbers(int a, int b) {
		return a+b;
	}*/

}
