package com.sourabh.oops;

public class DemoAbstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vehicle v= new Vehicle(); abstracts classes cannot be instantiated.
		
		System.out.println("Car: ");
		Car c= new Car();
		c.start();
		
		System.out.println("Scooter: ");
		Scooter sc= new Scooter();
		sc.start();

	}

}


abstract class Vehicle{  //this is abstract class
	
	int noOfTyres;
	abstract void start();
	
}

class Car extends Vehicle{

	void start() {
		System.out.println("Starts with Key");
		
	}
	
	
}

class Scooter extends Vehicle{

	void start() {
		
		System.out.println("Starts with kick");
	}
}