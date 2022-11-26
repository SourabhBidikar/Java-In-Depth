package com.sourabh.oops;

public class DemoClass1 {
		public static void main(String[] args) {
			
			int a = 5;
			//similarly
			Aircraft cessna172 = new Aircraft();     //creates object of type aircraft
			
			//Also can be done as
			int b;
			b=8;
			//similarly
			Aircraft seratogga;
			seratogga = new Aircraft();
			
		
		}
}


class Aircraft {
	int passengers;  //num of passengers
	int cruiseSpeed; //miles per hour
	int fuelCapacity;  //gallons
	int fuelBurnRate;    //miles per gallon
	
	double Endurance()
	{
		return fuelCapacity/fuelBurnRate;
	}
	
	//passing arguments
	double FuelNeeded(int time)
	{
		return fuelBurnRate*time;
	}
	
}
