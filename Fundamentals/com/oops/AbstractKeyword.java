package com.oops;

abstract class Vehicle11{
	
	/*
	 * public void forward() {
	 * 
	 * System.out.println("Vehicle goes forward"); }
	 as no child is using this methods implementation we do not need it*/
	abstract public void forward();
	//similarly
	abstract public void honks();
	
	public void stop() {
		System.out.println("It stops!!!");
	}
	
	
	//as we can see we have stop() with implementation so we do not have 100% abstraction as in interfaces
}

class Car11 extends Vehicle11{
	
	@Override
	public void forward() {
		System.out.println("Car goes forward");	
	}

	@Override
	public void honks() {
		System.out.println("Car honks the horn");
		
	}
	
}

class Bus extends Vehicle11{
	
	@Override
	public void forward() {
		System.out.println("Bus goes forward");	
		
	}

	@Override
	public void honks() {
		System.out.println("Bus honks the horn");
		
	}
}

public class AbstractKeyword {

	public static void main(String[] args){
		
		Car11 c1 = new Car11();
		c1.forward();
		c1.honks();
		c1.stop();
		
		Bus b1= new Bus();
		b1.forward();
		b1.honks();
		b1.stop();
		

	}

}
