package com.oops;

public class ConstructorsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1= new Dog();
		Dog d2= new Dog("Flash",5000);

		System.out.println(d1.getName()+" "+d1.getCost());

		System.out.println(d2.getName()+" "+d2.getCost());
	}

}




class Dog {
	private String name;
	private int cost;
	
	Dog(){
		this("Sheru",1000);
	}
	
	Dog(String name, int cost){
		this.name=name;
		this.cost=cost;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}
	
	
}