package com.oops;

import java.util.Scanner;

class FarmerLoan{
	private float pa;
	private static float rate;
	private float si;
	private float td;
	private float totalAmount;
	
	static {
		rate=2.5f;  //for float only 8 bytes are allocated only once
		//as rate of interest is same for all we can use static variable and to init it we can use static block.
	}
	
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principal amount: ");
		pa=sc.nextFloat();
		System.out.println("Enter time duration in years: ");
		td=sc.nextFloat();
		
	}
	
	void compute() {
		si=(pa*rate*td)/100;
		totalAmount=pa+si;
	}
	
	void display() {
		System.out.println("SI for farmer's loan is: "+si+ " at 2.5% interest per year");
		System.out.println("Total amount to be paid is "+totalAmount+"\n\n");
	}
}




public class LaunchLoanStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FarmerLoan f1= new FarmerLoan();
		FarmerLoan f2= new FarmerLoan();
		
		f1.input();
		f1.compute();
		f1.display();
		
		f2.input();
		f2.compute();
		f2.display();

	}

}
