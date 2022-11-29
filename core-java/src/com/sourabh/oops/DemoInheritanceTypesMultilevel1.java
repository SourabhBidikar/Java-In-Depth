package com.sourabh.oops;

public class DemoInheritanceTypesMultilevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A obj");
		A a1= new A();
		a1.showA();
		//a1.showB(); will not work will give error.
		
		
		System.out.println("\n\nB obj");
		B b1= new B();
		b1.showA();
		b1.showB();
		
		System.out.println("\n\nC obj");
		C c1= new C();
		c1.showA();
		c1.showB();
		c1.showC();

	}

}


class A{
	void showA() {
		System.out.println("class A method show");
	}
}

class B extends A{
	void showB() {
		System.out.println("class B method show");
	}
}

class C extends B{
	void showC() {
		System.out.println("class C method show");
	}
}
