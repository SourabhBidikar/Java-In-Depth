package com.sourabh.oops;

public class DemoPolyCase1 {

	public static void main(String[] args) {

		DemoPolyCase1 dpc = new DemoPolyCase1();
		
		dpc.show('a');
		
		dpc.show(5,6,9); //for varargs
		dpc.show(); //for varargs
		
		/*
		 * here we passed character as arg still it called
		 * method with int as argument
		 * THIS IS CALLED AUTOMATIC PROMOTION.
		 */

	}

	void show(int a)
	{
		System.out.println("int method");
	}


	void show(String str)
	{
		System.out.println("string method");
	} 
	
////////////////////////////////////
	
	//variable args
	void show(int ... a)
	{
		System.out.println("arg method");
	}

	

}

