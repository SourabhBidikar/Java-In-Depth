package com.sourabh.oops;

public class demoabstractionInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}

//here concrete methods means simple methods
interface Student1{
	public static final int i=10;  //if we don't apply compiler will automatically apply public static final
	
	
	
	public abstract void show(); //abstract methods should always be public as they will be implemented.
	
	
	default void display() {
		//from java 8 onwards we can have concrete methods in interface but they should be default 
	}
	
	public static void run() {
		//or they should be public static
	}
}

class Demo implements Student1{
	public void show() {
		//compulsorily abstract methods should be implemented(overridden)
	}
	
	//no compulsion to implement concrete methods
}