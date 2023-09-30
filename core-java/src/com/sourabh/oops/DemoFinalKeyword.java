package com.sourabh.oops;

public class DemoFinalKeyword {

	public static void main(String[] args) {
		//the value of a final keyword cannot be changed
		//we use for constant values which we do not want to change in the program.
		
		final int i=10;
		//i=20; cannot reassign a value to the final variable
		//-----------------------------------------------
		
		Sec s1= new Sec();
		s1.m1();
	

	}

}


class First{
	final void m1() {
		System.out.println("m1 of first");
	}
}


final class Sec extends First{
	/*void m1() {
		System.out.println("m1 of Sec");
	}
	cannot override final method
	*/
}



/*class Third extends Sec{
	
}
Sec cannot be inherited as it is final class
*/
