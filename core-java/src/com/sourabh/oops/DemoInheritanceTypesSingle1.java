package com.sourabh.oops;

public class DemoInheritanceTypesSingle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("X obj");
		X x1= new X();
		x1.showX();
		//a1.showB(); will not work will give error.
		
		
		System.out.println("\n\nY obj");
		Y y1= new Y();
		y1.showX();
		y1.showY();
		
		
		

	}

}



class X{
	void showX() {
		System.out.println("class X method show");
	}
}

class Y extends X{
	void showY() {
		System.out.println("class Y method show");
	}
}
