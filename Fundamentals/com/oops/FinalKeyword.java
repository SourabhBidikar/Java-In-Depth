package com.oops;

//final class Vehicle{
//final class cannot be inherited

class Vehicle{
	
	final double pi=3.14;
	
	final void disp() {
		System.out.println("Vehicle");
		
//		pi=4;  we cannot change value of final variable
		
		System.out.println(pi);
	}
	
	//final methods can be overloaded.
	void disp(int a) { 
		 System.out.println("Vehicle2"); 
	}
}

class Car extends Vehicle{
	/*
	 * void disp() { System.out.println("Vehicle"); }
	 
	 
	 final methods can be inherited but cannot be overridden
	 */
}

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1= new Car();
		c1.disp();
	}

}
