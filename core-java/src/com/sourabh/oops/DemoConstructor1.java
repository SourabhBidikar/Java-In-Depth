package com.sourabh.oops;

public class DemoConstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Airplane cessna172 = new Airplane(); //uses default constructor
		Airplane seratogga = new Airplane(180,190, 180, 15);
		
		cessna172.passengers=140;
		cessna172.cruiseSpeed=150;
		cessna172.fuelCapacity=160;
		cessna172.fuelBurnRate=13;
		
		

		
		System.out.println("Numbers of Passengers in cessna172= "+cessna172.passengers);
		System.out.println("Fuel Capacity of cessna172 = "+cessna172.fuelCapacity+" gallons");
		System.out.println("Endurance to stay aloft of cessna172 is= "+cessna172.Endurance());
		System.out.println("fuel needed by cessna172 for a 3 hour flight is "+ cessna172.FuelNeeded(3)+" gallons");

		
		System.out.println("\n\nNumbers of Passengers in seratogga= "+seratogga.passengers);
		System.out.println("Fuel Capacity of seratogga = "+seratogga.fuelCapacity+" gallons");
		System.out.println("Endurance to stay aloft of seratogga is= "+seratogga.Endurance());
		System.out.println("fuel needed by seratogga for a 3 hour flight is "+ seratogga.FuelNeeded(3)+" gallons");
	}

}

class Airplane {
	int passengers;  //num of passengers
	int cruiseSpeed; //miles per hour
	int fuelCapacity;  //gallons
	int fuelBurnRate;    //miles per gallon
	
	public Airplane() {
		// TODO Auto-generated constructor stub
		//if only parametrised constructor exists we will have to compulsorily initialze while creating object so 
		//we have created this no-arg contructor in case we don't want to initialze.
		//if we do not have any contructor java complier creates default constructor which is invisble to us.
	}
	
	Airplane(int p, int cs, int fc, int fbr){
		
		passengers=p;
		cruiseSpeed=cs;
		fuelCapacity=fc;
		fuelBurnRate=fbr;
	}
	
	

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
