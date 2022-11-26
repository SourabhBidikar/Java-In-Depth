package com.sourabh.oops;

public class DemoClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aircraft cessna172 = new Aircraft();
		
		cessna172.passengers=140;
		cessna172.fuelCapacity=160;
		cessna172.fuelBurnRate=13;
		cessna172.cruiseSpeed=150;
		
		//also we can create and define at the same time using constructor

		
		System.out.println("Numbers of Passengers in cessna172= "+cessna172.passengers);
		System.out.println("Fuel Capacity of cessna172 = "+cessna172.fuelCapacity+" gallons");
		
		
		//using endurance() member method of airCraft class
		System.out.println("Endurance to stay aloft of cessna172 is= "+cessna172.Endurance());
		
		System.out.println("fuel needed by cessna172 for a 3 hour flight is "+ cessna172.FuelNeeded(3)+" gallons");

	}

}

//we do not define Aircraft as it is already defined in this package in Democlass1.java