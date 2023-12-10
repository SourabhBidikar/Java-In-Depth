package com.oops;

interface IDemo{
		static void m1() {
			
			
			System.out.println("In static method");
		}
		
		void m2();
}

class DemoImpl implements IDemo{
	public void m2() {
		System.out.println("In implemented method");
	}
}


public class InterfaceStaticMethod {

	public static void main(String[] args) {
		
		IDemo.m1();  //as it is static method need to call directly with Interface name.
		
		IDemo ex1= new DemoImpl();
		
		ex1.m2();
		
	}

}
