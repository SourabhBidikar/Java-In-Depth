package com.sourabh;

public class DemoInheritanceRelationTypes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car altroz = new Car(4,"white");
		
		System.out.println("The color is "+altroz.color);
		System.out.println("It has "+altroz.wheels+" wheels");
		
		System.out.print("Altroz is "); altroz.movesForward(); //inherited from vehicle
	}

}
/*here Car "IS-A" Vehicle
 * 
 * Association
 * WEAK:
   Car "Has-A" Music-player but MP is not dependent on car, car is not dependent on MP so it is aggregation. 
   STRONG:
   Car "Has-A" Engine but Engine is  dependent on car, car is  dependent on Engine so it is composition. 
 */




class Vehicle{
	void movesForward() {
		System.out.print("moving forward");
	}
}

class Car extends Vehicle{
	int wheels;
	String color;
	Car(int wheels, String color){
		this.color=color;
		this.wheels=wheels;
	}
	MusicPlayer m1= new MusicPlayer(2);
	Engine e1= new Engine("Electric");
	
}

class MusicPlayer{
	int din;
	MusicPlayer(int din){
		this.din=din;
		System.out.println("Musicplayer is a "+this.din);
	}
}

class Engine{
	String type;
	
	Engine(String type){
		this.type=type;
		System.out.println("Engine is:"+this.type);
	}
}