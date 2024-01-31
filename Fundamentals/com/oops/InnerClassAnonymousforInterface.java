package com.oops;

interface Iexample11{
	void disp() ;
	void add();
}	

public class InnerClassAnonymousforInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iexample11 i1= new Iexample11() {
			
			
			public void disp() {
				System.out.println("Hello");
				
			}
			
			
			public void add() {
				System.out.println(1+2);
				
			}
		};  //Anonymous inner class till here
		
		
		i1.disp();
		i1.add();
	}

}
//we can create object of interface only if we provide implementation using anonymous inner class

//similarly we can create obj of functional interface if we provide implementation using either above or lambda expressions