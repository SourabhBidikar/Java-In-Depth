package com.sourabh;
import java.util.Scanner;

public class DemoMethodsParams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers to find which one is larger:\n");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int res= largerNum(num1,num2);
		System.out.println(res+" is larger.");
	}
	
	public static int largerNum(int a, int b)
	{
		if(a>=b) return a;
		return b;
	}

}
