package com.oops;

interface Printable{
	void print();

}

interface Showable{
	void print();

}

class TestImpl implements Printable,Showable{

	@Override
	public void print() {
		System.out.println("Hello");
		
//		There is no ambiguity as implmentation is only once 
		
	}
	
}
public class InterfaceMultipleInheritance {

	public static void main(String[] args) {

		TestImpl t1= new TestImpl();

	}

}
