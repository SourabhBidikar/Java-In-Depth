package com.oops;


interface IDrawable{
	void draw();
	default void msg() {
		System.out.println("In Default method");
	}
}


class Drawable implements IDrawable{


	public void draw() {
		System.out.println("Drawing");
	}
	
}


public class InterfaceDefaultMethod {

	public static void main(String[] args) {
		IDrawable d1= new Drawable();
		d1.draw();
		d1.msg();

	}

}
