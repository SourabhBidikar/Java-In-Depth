package com.ExceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public UnderAgeException(String msg) {
		super(msg);  //logic return in parent of parent i.e parent of Exception i.e Throwable
	}
}

class OverAgeException extends Exception{
	public OverAgeException(String msg) {
		super(msg);
	}
}


class License{
	
	int age;
	
	
	public void input() {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter age:");
		age=scan.nextInt();
	}
	
	public void verifyAge() throws UnderAgeException,OverAgeException{
		if(age>=18&&age<60) {
			System.out.println("Application for license accepted");
		}
		
		else {
			if(age<18)	throw new UnderAgeException("Applicant underage!!!");
			else throw new OverAgeException("Applicant Over age");
		}
	}
	
}


class RtoOffice{
	
	public void licenseApplication() {
		License li1 = new License();
		li1.input();
		try{
			li1.verifyAge();
		}
		catch(UnderAgeException|OverAgeException ua) {
			System.out.println(ua.getMessage());
			System.out.println("May be you did mistake while entering age, enter again");
			try {
				li1.input();
				li1.verifyAge();
			}
			catch(UnderAgeException|OverAgeException ua1) {
				System.out.println(ua1.getMessage());
				System.out.println("Error submitting application.");
			}
//			catch(OverAgeException oa1) {
//				System.out.println(oa1.getMessage());
//				System.out.println("Error submitting application.");
//			}
		}
//		catch(OverAgeException oa) {
//			System.out.println(oa.getMessage());
//			System.out.println("May be you did mistake while entering age, enter again");
//			try {
//				li1.input();
//				li1.verifyAge();
//			}
//			catch(UnderAgeException ua2) {
//				System.out.println(ua2.getMessage());
//				System.out.println("Error submitting application.");
//			}
////			catch(OverAgeException oa2) {
////				System.out.println(oa2.getMessage());
////				System.out.println("Error submitting application.");
////			}
//		}
	}
	
}

public class CustomExceptionEx2 {

	public static void main(String[] args) {
		
			RtoOffice rto1 = new RtoOffice();
			rto1.licenseApplication();
	}

}
