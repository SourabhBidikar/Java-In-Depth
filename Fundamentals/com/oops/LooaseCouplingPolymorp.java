package com.oops;

class Plane{
	public void fly() {
		System.out.println("Plane is flying");
	}
	
	public void land() {
		System.out.println("Plane is landing");
	}
	
	public void takeoff() {
		System.out.println("Plane took off");
	}

}

class CargoPlane extends Plane{
	public void fly() {
		System.out.println("CargoPlane is flying");
	}
	
	
}

class FighterPlane extends Plane{
	public void fly() {
		System.out.println("Fighter Plane is flying");
	}
	
	
}

class PassengerPlane extends Plane{
	public void fly() {
		System.out.println("Passenger Plane is flying");
	}
	
}

class Airport{
	public void flyToDestination(Plane p) {
		p.takeoff();
		p.fly();
		p.land();
	}
}


public class LooaseCouplingPolymorp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp= new CargoPlane();
		FighterPlane fp= new FighterPlane();
		PassengerPlane pp= new PassengerPlane();
		
		
		//polymorphism using loose coupling 
		Airport  a = new Airport();
		a.flyToDestination(cp);
		a.flyToDestination(fp);
		a.flyToDestination(pp);
	}

}
