package com.oops;


class Parent{
	public void sleep() {
		System.out.println("Sleep!!!");
	}
	public void cry() {
		System.out.println("Parents crying");
	}
}

class Child11 extends Parent{
	public void cry() {
		System.out.println("Child 1 crying");
	}
	
	public void eats() {
		System.out.println("Child 1 eats");
	}
}

class Child12 extends Parent{
	public void cry() {
		System.out.println("Child 2 crying");
	}
	
}	


public class ParentsCrying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//loose coupling , upcasting down here 
		
		Parent p1= new Child11();
		Parent p2= new Child12();
		p2.sleep();
		p2.cry();
		
		
		
		p1.sleep();   //Parent type ref can make call to inherited method of child type
		p1.cry();     //Parent type ref can make call to overriden method of child type
		//p1.eats();    //Parent type ref cannot make call to specialized method of child type
		
		((Child11) p1).eats();   //by downcasting we can achieve this
		
		Child11 c1 = new Child11();
		c1.sleep();
		c1.cry();
		c1.eats();

		
	}

}
