package com.sourabh.oops;

public class DemoInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog flash = new Dog();
		
		flash.eat();

	}

}


class Animal{
	void eat() {
		System.out.println("I am eating");
	}
}

class Dog extends Animal{
	
}