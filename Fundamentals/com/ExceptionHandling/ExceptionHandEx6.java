package com.ExceptionHandling;

import java.util.Scanner;

class Alpha1 {
	
	//using throws so that developer calling this method know that there is risky code 
	//in this method just by looking at the method signature.
	public void alpha1() throws ArithmeticException{
		Scanner scan= new Scanner(System.in);
		try{
			System.out.println("Enter a:");
			int a=scan.nextInt();
			System.out.println("Enter b:");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception handled in alpha1");
			throw ae;  //Re-throwing exception object
		}
		
//		throw works as return statement anything after it won't be executed
//		below statement wont execute as after throw control goes to caller method directly
//		System.out.println("this statement not in finally block");
//      if you still want to execute something after throw before control goes to caller method write it inside finally block		
		finally{
			System.out.println("this statement is inside finally block");
		}
	}
}

public class ExceptionHandEx6 {

	public static void main(String[] args) {
		
		Alpha1 a1= new Alpha1();
		try{
			a1.alpha1();
		}catch(ArithmeticException ae) {
			System.out.println("Rethrown Exception handled in Main method.");
		}
		
		//here we don;t need to use finally as below statement will execute as this method's catch will not throw exception obj
		System.out.println("Connection terminated from main");
		
	}

}
