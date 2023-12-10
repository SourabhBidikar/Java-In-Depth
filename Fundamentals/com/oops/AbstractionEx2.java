package com.oops;


abstract class Loan11{
	
	Loan11(){
		System.out.println("we can have contructor in abstract class");
	}
	
	abstract public void RateInt();
	
	public void welcome() {
		System.out.println("Welcome to xxx bank!");
	}
}

class HomeLoan extends Loan11{

	@Override
	public void RateInt() {
		System.out.println("interest Rate is 11% ");
	}
	
}

class EduLoan extends Loan11{

	@Override
	public void RateInt() {
		System.out.println("interest Rate is 8% ");	
	}
	
}
public class AbstractionEx2 {

	public static void main(String[] args) {
	
		//Loan11 l1 = new Loan11(); we cannot instantiate abstract class
		
		Loan11 l1= new HomeLoan();
		Loan11 l2= new EduLoan();
		
		l1.RateInt();
		l1.welcome();
		
		l2.RateInt();
		l2.welcome();		
		
	}

}
