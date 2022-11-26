package com.sourabh.oops;

public class DemoCopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike activa= new Bike("grey", 80);
		
		System.out.println("color and top speed of activa is "+ activa.color+" and "+ activa.topSpeed);
		
		Bike dio = new Bike(activa);
		
		System.out.println("\ncolor and top speed of dio is "+ dio.color+" and "+ dio.topSpeed);
		
	}

}


class Bike{
	
	String color;
	int topSpeed;
	
	Bike()
	{
		//no-arg constructor
	}
	
	Bike(String c,int ts)
	{
		//parameterised constructor
		this.color=c;
		this.topSpeed=ts;
	}
	
	Bike(Bike b)
	{
		//THIS IS COPY CONSTRUCTOR
		color= b.color;
		topSpeed=	b.topSpeed;	
	}
}