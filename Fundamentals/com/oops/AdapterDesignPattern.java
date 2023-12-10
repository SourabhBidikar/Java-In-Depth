package com.oops;

interface IExample1{
	void m1();
	void m2();
	void m3();
	void m4();
}

abstract class AdapterClass implements IExample1{     //this made abstract as we do not want to create object of this class.
	public void m1() {};
	public void m2() {};
	public void m3() {};
	public void m4() {};
}

class MyClass extends AdapterClass{
	
	public void m3() {
		System.out.println("In m3 method");
	}
}

public class AdapterDesignPattern {

	public static void main(String[] args) {
		
		IExample1 my1= new MyClass();
		my1.m3();

	}

}
