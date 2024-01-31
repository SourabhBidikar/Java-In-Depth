package com.oops;

@FunctionalInterface
interface IExample{
	void disp();
}


/*
 * class Example implements IExample{ 
 * 	public void disp() {
 * 		System.out.println("Hello"); 
 *	}
 *}
 * 
 * No  need to write as we can use lambda expressions and directly write for disp without using implements
 */

public class FunctionalInterfaceEx1 {

	public static void main(String[] args) {
		
		/*
		 * IExample i1= new Example();
		 *  i1.disp();
		 */
		
		
		IExample i1=()->System.out.println("Hello");
		
		i1.disp();

	}

}
